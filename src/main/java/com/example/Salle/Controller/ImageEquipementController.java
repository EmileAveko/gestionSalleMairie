package com.example.Salle.Controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.Salle.Entities.ImageEquipement;
import com.example.Salle.Service.ImageEquipementService;

@RestController
//@CrossOrigin(origins="*")
public class ImageEquipementController {

	@Autowired
	ImageEquipementService imageEquipementService;
	
	  @Autowired
	    private HttpServletRequest request;

	

	@PostMapping("/upload")
	public String uplaodImage(@RequestParam("imageFile") MultipartFile file) throws IOException {

		System.out.println("Original Image Byte Size - " + file.getBytes().length);
		ImageEquipement img = new ImageEquipement( file.getOriginalFilename(), file.getContentType(),
				compressBytes(file.getBytes()));
		imageEquipementService.createImageEquipement(img);
		// ResponseEntity.status(HttpStatus.OK);
		return  null;
	}
	
	@PostMapping("/uploading")
	public String uplaodImages(@RequestParam("imageFile") MultipartFile file) throws IOException {
        File dossier = new File("src/main/Images/static/gallery/upload");
        
        if(!dossier.exists()) {
        	dossier.mkdir();
        }
        File dest = new File("src/main/Images/static/gallery/upload"+file.getOriginalFilename());
    	
        file.transferTo(dest.toPath());
		ImageEquipement img = new ImageEquipement( file.getOriginalFilename(), "",null);
		imageEquipementService.createImageEquipement(img);
		return  null;
	}

	@GetMapping("/get/{imageName}" )
	public ImageEquipement getImage(@PathVariable("imageName") String imageName) throws IOException {

		final Optional<ImageEquipement> retrievedImage = imageEquipementService.getEquipementImage(imageName);
		ImageEquipement img = new ImageEquipement(retrievedImage.get().getNomPhoto(), retrievedImage.get().getType(),
				decompressBytes(retrievedImage.get().getPhoto()));
		return img;
	}
	
	@GetMapping("/gets/{imageName}" )
	public ImageEquipement getImages(@PathVariable("imageName") String imageName) throws IOException {

		final Optional<ImageEquipement> retrievedImage = imageEquipementService.getEquipementImage(imageName);
		ImageEquipement img = new ImageEquipement(retrievedImage.get().getNomPhoto(),null,null);
		return img;
	}


	// compress the image bytes before storing it in the database
	public static byte[] compressBytes(byte[] data) {
		Deflater deflater = new Deflater();
		deflater.setInput(data);
		deflater.finish();

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];
		while (!deflater.finished()) {
			int count = deflater.deflate(buffer);
			outputStream.write(buffer, 0, count);
		}
		try {
			outputStream.close();
		} catch (IOException e) {
		}
		System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);

		return outputStream.toByteArray();
	}

	// uncompress the image bytes before returning it to the angular application
		public static byte[] decompressBytes(byte[] data) {
			Inflater inflater = new Inflater();
			inflater.setInput(data);
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
			byte[] buffer = new byte[1024];
			try {
				while (!inflater.finished()) {
					int count = inflater.inflate(buffer);
					outputStream.write(buffer, 0, count);
				}
				outputStream.close();
			} catch (IOException ioe) {
			} catch (DataFormatException e) {
			}
			return outputStream.toByteArray();
		}
	}

	


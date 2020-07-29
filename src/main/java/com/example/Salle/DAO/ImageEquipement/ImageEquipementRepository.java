package com.example.Salle.DAO.ImageEquipement;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Salle.Entities.ImageEquipement;

public interface ImageEquipementRepository extends JpaRepository<ImageEquipement,Long> {

	Optional<ImageEquipement> findByNomPhoto(String name);

}

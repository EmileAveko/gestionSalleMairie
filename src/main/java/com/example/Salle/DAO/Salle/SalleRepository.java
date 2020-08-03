package com.example.Salle.DAO.Salle;

import java.util.Set;

//import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Salle.Entities.Salle;

public interface SalleRepository extends JpaRepository<Salle,Long> {
	
	@Query(value="SELECT * FROM salle where etat='libre'",nativeQuery = true)
	public Set<Salle> getInfo();
	
	public Salle findByNomsal(String nomsal);
}

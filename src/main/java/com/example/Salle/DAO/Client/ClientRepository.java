package com.example.Salle.DAO.Client;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Salle.Entities.Client;


public interface ClientRepository extends JpaRepository<Client ,Long> {
	
 public Client findByMail(String Nom);

//	public Client findprivateclient();
//	
//	 public final static String GET_LOAN_REPORTS = "SELECT * FROM loan_report  WHERE product = :product";
//
//     @Query(GET_LOAN_REPORTS,nativeQuery=true)
//  List<LoanReport> findByPreference(@Param("product")final String prouduct);    
}


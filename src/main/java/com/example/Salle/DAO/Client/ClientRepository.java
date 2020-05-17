package com.example.Salle.DAO.Client;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Salle.Entities.Client;


public interface ClientRepository extends JpaRepository<Client ,Long> {

}

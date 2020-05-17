package com.example.Salle.DAO.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Salle.Entities.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation,Long>{

}

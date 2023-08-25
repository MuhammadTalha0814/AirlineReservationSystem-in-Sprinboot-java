package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FlightDtls;


public interface FlightRepository extends JpaRepository<FlightDtls, Integer>{

}

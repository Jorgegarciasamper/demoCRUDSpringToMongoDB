package com.example.SpringBootToMongoDB.demo.DAO;

import com.example.SpringBootToMongoDB.demo.Entity.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PatientRepository extends MongoRepository<Patient, Integer> {

   // List findByName(String name);
//
   // @Query("{'contact.address': ?0}")
   // List findByAddress(String address);
}

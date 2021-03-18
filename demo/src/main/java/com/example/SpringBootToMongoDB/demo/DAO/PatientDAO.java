package com.example.SpringBootToMongoDB.demo.DAO;

import com.example.SpringBootToMongoDB.demo.Entity.Patient;
import com.example.SpringBootToMongoDB.demo.Entity.PatientUpdateload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
//https://www.baeldung.com/spring-component-repository-service
@Repository//genérico para cualquier componente administrado por Spring
public class PatientDAO {
    @Autowired
    private PatientRepository repository;
    //private PatientRepositoryMapper repository;

    public Collection<Patient> getPatients(){
        return repository.findAll();
    }

    public Patient createPatient(Patient patient) {
        return repository.insert(patient);
    }

    public Optional<Patient> getPatientById(int id) {
        return repository.findById(id);
    }
    public Optional<Patient> deletePatientById(int id){
        Optional<Patient> patient = repository.findById(id);
        patient.ifPresent(p -> {
            repository.deleteById(p.getId());//Ojo le pasas pacientes y borrar el paciente por id por eso es p.getId()
            });
        return patient;
    }

    public Optional<Patient> updatePatientById(int id, PatientUpdateload patientUpdateload) {
        Optional<Patient> patient = repository.findById(id);
        patient.ifPresent(p ->{ p.setUsername(patientUpdateload.getUsername());
        });
        //idem con todos los campos
        //patient.ifPresent(p ->{ p.setUsername(patientUpdateload.getLastname());});
        //Y salvar
        patient.ifPresent(p->{
            repository.save(p);
        });

        return patient;
    }
}

package com.example.SpringBootToMongoDB.demo.DAO;

import com.example.SpringBootToMongoDB.demo.Entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
//https://www.baeldung.com/spring-component-repository-service
@Repository//genérico para cualquier componente administrado por Spring
public class PatientDAO {
    @Autowired
    private PatientRepository repository;
    //private PatientRepositoryMapper repository;

    public Collection<Patient> getPatients()
    {
        return repository.findAll();
    }

    public Patient createPatient(Patient patient) {
        return repository.insert(patient);
    }

    public Optional<Patient> getPatientById(int id) { return repository.findById(id); }

    public Optional<Patient> deletePatientById(int id){
        Optional<Patient> patient = repository.findById(id);
        patient.ifPresent(p -> {
            repository.deleteById(p.getId());//Ojo le pasas pacientes y borrar el paciente por id por eso es p.getId()
            });
        return patient;
    }

    public Optional<Patient> updatePatientById(int id, Patient patient) {
        Optional<Patient> oPatient = repository.findById(id);
        oPatient.ifPresent(p ->{ p.setUsername(patient.getUsername());
        });
        //idem con todos los campos
        //patient.ifPresent(p ->{ p.setUsername(patientUpdateload.getLastname());});
        //Y salvar
        oPatient.ifPresent(p->{
            repository.save(p);
        });

        return oPatient;
    }
}

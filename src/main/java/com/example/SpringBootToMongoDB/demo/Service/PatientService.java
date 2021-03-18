package com.example.SpringBootToMongoDB.demo.Service;

import com.example.SpringBootToMongoDB.demo.DAO.PatientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SpringBootToMongoDB.demo.Entity.Patient;

import java.util.Collection;
import java.util.Optional;

//Logica de negocio - Modelo
@Service
public class PatientService {
    @Autowired
    private PatientDAO patientDAO;

    public Collection<Patient> getPatients(){
        return patientDAO.getPatients();
    }

    public Patient createPatient(Patient patient) {
        return patientDAO.createPatient(patient);
    }

    public Optional<Patient> getPatientById(int id) {
        return patientDAO.getPatientById(id);
    }

    public Optional<Patient> deletePatientById(int id) {
        return patientDAO.deletePatientById(id);
    }

    public Optional<Patient> updatePatientById(int id, Patient patient) {
        return patientDAO.updatePatientById(id, patient);
    }
}

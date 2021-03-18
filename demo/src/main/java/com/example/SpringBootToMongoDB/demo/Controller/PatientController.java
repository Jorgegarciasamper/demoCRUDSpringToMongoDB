package com.example.SpringBootToMongoDB.demo.Controller;

import com.example.SpringBootToMongoDB.demo.Entity.Patient;
import com.example.SpringBootToMongoDB.demo.Entity.PatientUpdateload;
import com.example.SpringBootToMongoDB.demo.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/patients")//No le especificamos -->, method = RequestMethod.GET)
public class PatientController {
    @Autowired//permite inyectar unas dependencias con otras dentro de Spring
    private PatientService patientService;
    @GetMapping
    public Collection<Patient> getPatient(){
        return patientService.getPatients();
    }
    @GetMapping(value="{id}")//Aqui le recogerá el id que vamos a usar
    //enlace https://www.adictosaltrabajo.com/2015/03/02/optional-java-8/
    //Usamos Optional de manera imperativa(anti-patrón)
    public Optional<Patient> getPatientById(@PathVariable("id") int id){
        return patientService.getPatientById(id);
    }
    @PostMapping
    public Patient postPatient(@RequestBody Patient patient){
        return patientService.createPatient(patient);
    }
    @PutMapping(value="{id}")
    public Optional<Patient> updatePatientById(@PathVariable("id") int id, @RequestBody PatientUpdateload patientUpdateload){
        return patientService.updatePatientById(id, patientUpdateload);
    }
    @DeleteMapping(value="{id}")
    public Optional<Patient> deletePatientById(@PathVariable("id") int id){
        return patientService.deletePatientById(id);
    }

}

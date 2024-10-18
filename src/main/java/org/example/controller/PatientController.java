package org.example.controller;

import org.example.dto.Patient;
import org.example.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService service;

    @GetMapping("/get-all")
    public List<Patient> getPatient() {
        return service.getPatient();
    }

    @PostMapping("/add-patient")
    public void addPatient(@RequestBody Patient patient){
        service.addPatient(patient);
    }
}

package org.example.service;

import org.example.dto.Patient;

import java.awt.*;
import java.util.List;

public interface PatientService {
    List<Patient> getPatient();
    void addPatient(Patient patient);
}

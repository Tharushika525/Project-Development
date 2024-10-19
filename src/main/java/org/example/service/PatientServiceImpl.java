package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.Patient;
import org.example.entity.PatientEntity;
import org.example.repository.PatientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{

    final PatientRepository repository;
    final ModelMapper mapper;

    @Override
    public List<Patient> getPatient() {
        List<Patient> patients = new ArrayList<>();
        repository.findAll().forEach(patient ->{patients.add(mapper.map(patient, Patient.class));
        });
        return patients;

    }
    @Override
    public void addPatient(Patient patient) {
            repository.save(mapper.map(patient, PatientEntity.class));
    }


    }


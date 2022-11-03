package com.saraya.com.saraya.Service;

import com.saraya.com.saraya.Entity.Programmer;
import com.saraya.com.saraya.repository.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgrammerService {
    @Autowired
    ProgrammerRepository repository;

    public String createProgram(Programmer program){
        repository.save(program);
        return "Programmer successfully created";
    }
    public List<Programmer> getAllProgrammers(){
        return repository.findAll();
    }
    public Optional<Programmer> getById(int id){
        return repository.findById(id);
    }

    public Programmer updateProgrammer(int id, Programmer programmerDetails){
        Programmer programmer = repository.findById(id).get();
        programmer.setFirstname(programmerDetails.getFirstname());
        programmer.setLastname(programmer.getLastname());
        programmer.setEmail(programmerDetails.getEmail());
        return repository.save(programmer);
}
    public String deleteProgrammer(int id){
        repository.deleteById(id);
        return "Programmer successfully deleted";

    }
    public Programmer updateEmail(int id, String newEmail){
        Programmer programmer = repository.findById(id).get();
        programmer.setEmail(newEmail);
        return repository.save(programmer);
    }
}

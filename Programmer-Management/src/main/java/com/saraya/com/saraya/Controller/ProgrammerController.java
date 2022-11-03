package com.saraya.com.saraya.Controller;

import com.saraya.com.saraya.Entity.Programmer;
import com.saraya.com.saraya.Service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/programmermanagement")
public class ProgrammerController {

    @Autowired
    ProgrammerService service;

    @PostMapping ("/registration")
    public String createProgrammer(@RequestBody Programmer programmer){
        return service.createProgram(programmer);
    }
    @GetMapping("/programmers")
    public List<Programmer> getAllProgrammers(){
        return service.getAllProgrammers();
    }

    @GetMapping("/{id}")
    public Optional<Programmer> getProgrammer(@PathVariable int id){
        return service.getById(id);
    }
    @PutMapping ("/update/{id}")
    public Programmer updateProgrammer(@PathVariable int id, @RequestBody Programmer programmerDetails){
        return service.updateProgrammer(id, programmerDetails);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProgrammer(@PathVariable int id){
        return service.deleteProgrammer(id);
    }
    @PutMapping ("/updateEmail/{id}")
    public Programmer updateEmail(@PathVariable int id, @RequestParam String newEmail){
        return service.updateEmail(id,newEmail );
    }






}

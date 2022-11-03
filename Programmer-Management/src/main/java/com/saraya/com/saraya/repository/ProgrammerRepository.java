package com.saraya.com.saraya.repository;

import com.saraya.com.saraya.Entity.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammerRepository extends JpaRepository<Programmer, Integer> {
}

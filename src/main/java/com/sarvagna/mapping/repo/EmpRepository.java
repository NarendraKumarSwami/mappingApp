package com.sarvagna.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sarvagna.mapping.model.Empolyee;



@Repository
public interface EmpRepository  extends JpaRepository<Empolyee, Integer>{

}

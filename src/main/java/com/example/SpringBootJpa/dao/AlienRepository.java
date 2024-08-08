package com.example.SpringBootJpa.dao;

import com.example.SpringBootJpa.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepository extends CrudRepository<Alien,Integer> { //Alien is class and Integer is datatype of primary key


}

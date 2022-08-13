package com.sim.repository;

import com.sim.models.Sim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SimCardRepo extends JpaRepository<Sim, Integer> {

}

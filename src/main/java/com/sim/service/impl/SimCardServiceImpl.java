package com.sim.service.impl;

import com.sim.models.Sim;
import com.sim.repository.SimCardRepo;
import com.sim.service.SimCardService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimCardServiceImpl implements SimCardService {

  @Autowired
  private SimCardRepo simCardRepo;

  @Override
  public String addSimCard(Sim simRequest) {
    simCardRepo.save(simRequest);
    return "SUCCESS";
  }

  @Override
  public List<Sim> listAllSimCard() {
    return simCardRepo.findAll();
  }

  @Override
  public String updateRecordById(Sim updateRequest, Integer id) {
    updateRequest.setId(id);
    simCardRepo.save(updateRequest);
    return "SUCEESS";
  }

  @Override
  public String deleteRecords(Integer id) {
     simCardRepo.deleteById(id);
    return "SUCCESS";
  }
}

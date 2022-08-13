package com.sim.service;


import com.sim.models.Sim;
import java.util.List;

public interface SimCardService {

   String addSimCard(Sim simRequest);

   List<Sim> listAllSimCard();

   String updateRecordById(Sim updateRequest, Integer id);

   String deleteRecords(Integer id);
}

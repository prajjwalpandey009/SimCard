package com.sim.controller;

import com.sim.models.Sim;
import com.sim.service.SimCardService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimCardController {

  @Autowired
  private SimCardService simCardService;

  @GetMapping("")
  public ResponseEntity<Integer> saveCardDetails() {
    return ResponseEntity.ok(200);
  }

  @PostMapping("/add")
  public ResponseEntity<String> saveCardDetails(@RequestBody Sim simCardRequest) {
    return ResponseEntity.ok(simCardService.addSimCard(simCardRequest));
  }

  @GetMapping("/listall")
  public ResponseEntity<List<Sim>> findAllSimCardDetails() {
    return ResponseEntity.ok(simCardService.listAllSimCard());
  }

  @PutMapping("/{id}")
  public ResponseEntity<String> updateSimCardDetails(@RequestBody Sim updateRequest, @PathVariable("id") Integer id) {
    return ResponseEntity.ok(simCardService.updateRecordById(updateRequest, id));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteRecord(@PathVariable("id") Integer id) {
    return ResponseEntity.ok(simCardService.deleteRecords(id));
  }

}

package com.sim.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sim {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @JsonProperty("Sim_card_no")
  private Long simCardNo;

  @JsonProperty("Mobile_no")
  private Long mobileNo;

  @JsonProperty("Status")
  private String status;

  @JsonProperty("Expiry_date")
  private Date expiryDate;

  @JsonProperty("State_of_registration")
  private String stateOfRegistration;

  @JsonProperty("KYC")
  private String kyc;

  @JsonProperty("TeleCom_Provider")
  private String teleComProvider;

  @JsonProperty("Full_Name")
  private String fullName;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Long getSimCardNo() {
    return simCardNo;
  }

  public void setSimCardNo(Long simCardNo) {
    this.simCardNo = simCardNo;
  }

  public Long getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(Long mobileNo) {
    this.mobileNo = mobileNo;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Date getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(Date expiryDate) {
    this.expiryDate = expiryDate;
  }

  public String getStateOfRegistration() {
    return stateOfRegistration;
  }

  public void setStateOfRegistration(String stateOfRegistration) {
    this.stateOfRegistration = stateOfRegistration;
  }

  public String getKyc() {
    return kyc;
  }

  public void setKyc(String kyc) {
    this.kyc = kyc;
  }

  public String getTeleComProvider() {
    return teleComProvider;
  }

  public void setTeleComProvider(String teleComProvider) {
    this.teleComProvider = teleComProvider;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }
}

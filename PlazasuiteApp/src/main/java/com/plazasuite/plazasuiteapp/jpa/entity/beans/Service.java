/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plazasuite.plazasuiteapp.jpa.entity.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *https://stackoverflow.com/questions/3404853/multiple-unique-constraints-in-jpa
 * @author SUJIKUMAR
 * http://www.objectdb.com/java/jpa/entity/id
 */
@Entity
@Table(name = "service_table")
public class Service implements Serializable{
  @Id
  @Column(name = "service_id")
  @GeneratedValue
  private Integer serviceId;
  
  @Column(name = "service_name")
  private String serviceName;
  @Column(name = "service_rate")
  private Integer serviceRate;
  @Column(name = "sgst_in_percentage")
  private Integer sgstInPercentage;
  @Column(name = "cgst_in_percentage")
  private Integer cgstInPercentage;
  @Column(name = "gst_in_percentage")
  private Integer gstInPercentage;

    public Service() {
    }

    public Service(Integer serviceId, String serviceName, Integer serviceRate, Integer sgstInPercentage, Integer cgstInPercentage, Integer gstInPercentage) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceRate = serviceRate;
        this.sgstInPercentage = sgstInPercentage;
        this.cgstInPercentage = cgstInPercentage;
        this.gstInPercentage = gstInPercentage;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(Integer serviceRate) {
        this.serviceRate = serviceRate;
    }

    public Integer getSgstInPercentage() {
        return sgstInPercentage;
    }

    public void setSgstInPercentage(Integer sgstInPercentage) {
        this.sgstInPercentage = sgstInPercentage;
    }

    public Integer getCgstInPercentage() {
        return cgstInPercentage;
    }

    public void setCgstInPercentage(Integer cgstInPercentage) {
        this.cgstInPercentage = cgstInPercentage;
    }

    public Integer getGstInPercentage() {
        return gstInPercentage;
    }

    public void setGstInPercentage(Integer gstInPercentage) {
        this.gstInPercentage = gstInPercentage;
    }

    @Override
    public String toString() {
        return "Service{" + "serviceId=" + serviceId + ", serviceName=" + serviceName + ", serviceRate=" + serviceRate + ", sgstInPercentage=" + sgstInPercentage + ", cgstInPercentage=" + cgstInPercentage + ", gstInPercentage=" + gstInPercentage + '}';
    }

    
    
  
}

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
@Table(name = "rooms_table")
public class Room implements Serializable{
  @Id
  @Column(name = "room_id")
  @GeneratedValue
  private Integer roomId;
  
  @Column(name = "room_number")
  private String roomNumber;
  @Column(name = "room_type")
  private String roomType;
  @Column(name = "room_rate")
  private Integer roomRate;
  @Column(name = "room_capacity")
  private Integer roomCapacity;
  @Column(name = "room_plan")
  private String roomPlan;
  @Column(name = "is_open_for_service")
  private Boolean isOpenForService;

    public Room() {
    }

    public Room(Integer roomId, String roomNumber, String roomType, Integer roomRate, Integer roomCapacity, String roomPlan, Boolean isOpenForService) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomRate = roomRate;
        this.roomCapacity = roomCapacity;
        this.roomPlan = roomPlan;
        this.isOpenForService = isOpenForService;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(Integer roomRate) {
        this.roomRate = roomRate;
    }

    public Integer getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(Integer roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public String getRoomPlan() {
        return roomPlan;
    }

    public void setRoomPlan(String roomPlan) {
        this.roomPlan = roomPlan;
    }

    public Boolean getIsOpenForService() {
        return isOpenForService;
    }

    public void setIsOpenForService(Boolean isOpenForService) {
        this.isOpenForService = isOpenForService;
    }

    @Override
    public String toString() {
        return "Room{" + "roomId=" + roomId + ", roomNumber=" + roomNumber + ", roomType=" + roomType + ", roomRate=" + roomRate + ", roomCapacity=" + roomCapacity + ", roomPlan=" + roomPlan + ", isOpenForService=" + isOpenForService + '}';
    }
    
  
}

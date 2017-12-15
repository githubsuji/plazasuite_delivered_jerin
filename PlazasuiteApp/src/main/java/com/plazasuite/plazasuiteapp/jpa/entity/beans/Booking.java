/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plazasuite.plazasuiteapp.jpa.entity.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author SUJIKUMAR
 */
@Entity
@Table(name = "booking_table")
public class Booking implements Serializable{

    @Id
    @Column(name = "booking_id")
    @GeneratedValue
    private Long bookingId;
    
    @Column(name = "room_id")
    private Integer roomId;
    
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "middle_name")
    private String middleName;
    
    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "district")
    private String district;
    
    @Column(name = "state_name")
    private String stateName;
    
    @Column(name = "pin_or_zip_code")
    private String pinOrZipCode;
    
    @Column(name = "country")
    private String country;
    
    @Column(name = "nationality")
    private String nationality;
    
    @Column(name = "check-in_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkInDateTime;
    
    @Column(name = "check-out_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkOutDateTime;
    
    @Column(name = "address_proof")
    private String addressProof;
    
    @Column(name = "address_proof_id")
    private String addressProofId;
    
    @Column(name = "is_dirty")
    private Boolean isDirty;
    
    @Column(name = "is_booked")
    private Boolean isBooked;
    
    @Column(name = "is_extra_bed_opted")
    private Boolean isExtraBedOpted;

    public Booking() {
    }

    public Booking(Long bookingId, Integer roomId, String firstName, String middleName, String lastName, String address, String district, String stateName, String pinOrZipCode, String country, String nationality, Date checkInDateTime, Date checkOutDateTime, String addressProof, String addressProofId, Boolean isDirty, Boolean isBooked, Boolean isExtraBedOpted) {
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.district = district;
        this.stateName = stateName;
        this.pinOrZipCode = pinOrZipCode;
        this.country = country;
        this.nationality = nationality;
        this.checkInDateTime = checkInDateTime;
        this.checkOutDateTime = checkOutDateTime;
        this.addressProof = addressProof;
        this.addressProofId = addressProofId;
        this.isDirty = isDirty;
        this.isBooked = isBooked;
        this.isExtraBedOpted = isExtraBedOpted;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getPinOrZipCode() {
        return pinOrZipCode;
    }

    public void setPinOrZipCode(String pinOrZipCode) {
        this.pinOrZipCode = pinOrZipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getCheckInDateTime() {
        return checkInDateTime;
    }

    public void setCheckInDateTime(Date checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }

    public Date getCheckOutDateTime() {
        return checkOutDateTime;
    }

    public void setCheckOutDateTime(Date checkOutDateTime) {
        this.checkOutDateTime = checkOutDateTime;
    }

    public String getAddressProof() {
        return addressProof;
    }

    public void setAddressProof(String addressProof) {
        this.addressProof = addressProof;
    }

    public String getAddressProofId() {
        return addressProofId;
    }

    public void setAddressProofId(String addressProofId) {
        this.addressProofId = addressProofId;
    }

    public Boolean getIsDirty() {
        return isDirty;
    }

    public void setIsDirty(Boolean isDirty) {
        this.isDirty = isDirty;
    }

    public Boolean getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(Boolean isBooked) {
        this.isBooked = isBooked;
    }

    public Boolean getIsExtraBedOpted() {
        return isExtraBedOpted;
    }

    public void setIsExtraBedOpted(Boolean isExtraBedOpted) {
        this.isExtraBedOpted = isExtraBedOpted;
    }

    @Override
    public String toString() {
        return "Booking{" + "bookingId=" + bookingId + ", roomId=" + roomId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", address=" + address + ", district=" + district + ", state=" + stateName + ", pinOrZipCode=" + pinOrZipCode + ", country=" + country + ", nationality=" + nationality + ", checkInDateTime=" + checkInDateTime + ", checkOutDateTime=" + checkOutDateTime + ", addressProof=" + addressProof + ", addressProofId=" + addressProofId + ", isDirty=" + isDirty + ", isBooked=" + isBooked + ", isExtraBedOpted=" + isExtraBedOpted + '}';
    }
    

    
}

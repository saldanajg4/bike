package com.spring.bike.models;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/***
 * Create primary key for the class normally called id and use
 * annotations to specify @Id and auto generated.  
 * We need to ignore other hibernate methods not needed on the 
 * Entity.
 */
@Entity
@Table(name="bike")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bike {
     //added as primary key for record and create getter and setter
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
 
     /****
      * I will leave these properties as they are.  
      * Columnames and column mapping but jpa will directly map to our structure
      * by just attribute name and column name
      */
    @Column(name = "name")
     private String name;

     @Column(name = "email")
     private String email;

     @Column(name = "phone")
     private String phone;

     @Column(name = "model")
     private String model;

     @Column(name = "serialNumber")
     private String serialNumber;

     @Column(name = "purchasePrice")
     private BigDecimal purchasePrice;
 
     //passing date data back and forth easier
     @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
     @Column(name = "purchaseDate")
     private Date purchaseDate;

     @Column(name = "contact")
     private boolean contact;
 
     public String getName() {
         return name;
     }
 
     public void setName(String name) {
         this.name = name;
     }
 
     public String getEmail() {
         return email;
     }
 
     public void setEmail(String email) {
         this.email = email;
     }
 
     public String getPhone() {
         return phone;
     }
 
     public void setPhone(String phone) {
         this.phone = phone;
     }
 
     public String getModel() {
         return model;
     }
 
     public void setModel(String model) {
         this.model = model;
     }
 
     public String getSerialNumber() {
         return serialNumber;
     }
 
     public void setSerialNumber(String serialNumber) {
         this.serialNumber = serialNumber;
     }
 
     public BigDecimal getPurchasePrice() {
         return purchasePrice;
     }
 
     public void setPurchasePrice(BigDecimal purchasePrice) {
         this.purchasePrice = purchasePrice;
     }
 
     public Date getPurchaseDate() {
         return purchaseDate;
     }
 
     public void setPurchaseDate(Date purchaseDate) {
         this.purchaseDate = purchaseDate;
     }
 
     public boolean isContact() {
         return contact;
     }
 
     public void setContact(boolean contact) {
         this.contact = contact;
     }
 
     public Long getId() {
         return id;
     }
 
     public void setId(Long id) {
         this.id = id;
     }
}
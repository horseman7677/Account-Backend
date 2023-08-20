package com.horseman.backend_xyz.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String customerNumber;
    private String companyName;
    private String countryCode;
    private Date created_time;
    private Integer invoiceAmount;
}

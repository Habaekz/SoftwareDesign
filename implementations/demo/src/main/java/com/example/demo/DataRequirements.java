package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class DataRequirements {

    @Id
    private Integer id;
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String filetype;
    private String filequality;
    private String imageprocessing;

}

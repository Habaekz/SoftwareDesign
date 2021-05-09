package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class SciencePlan {

    @Id
    private Integer id;
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String creator;
    private String submitor;
    private String Objective;
    private String stars_system;
    private String Schedule;
    private String telescope_location;
    private List<DataRequirements> data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

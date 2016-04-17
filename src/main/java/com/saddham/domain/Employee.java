package com.saddham.domain;

/**
 * Created by saddhamp on 18/3/16.
 */
public class Employee {
    private Long id;
    private String name;
    private String designation;
    private String bu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getBu() {
        return bu;
    }

    public void setBu(String bu) {
        this.bu = bu;
    }
}

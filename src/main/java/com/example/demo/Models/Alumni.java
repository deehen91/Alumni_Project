package com.example.demo.Models;

import javax.persistence.*;

@Entity

public class Alumni {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int alumID;

    @Column
    private String alumniName;
    @Column
    private String alumniSchool;
    @Column
    private String alumniMajor;
    @Column
    private String alumniGradyear;

    public int getAlumID() {
        return alumID;
    }

    public void setAlumID(int alumID) {
        this.alumID = alumID;
    }

    public String getAlumniName() {
        return alumniName;
    }

    public void setAlumniName(String alumniName) {
        this.alumniName = alumniName;
    }

    public String getAlumniSchool() {
        return alumniSchool;
    }

    public void setAlumniSchool(String alumniSchool) {
        this.alumniSchool = alumniSchool;
    }

    public String getAlumniMajor() {
        return alumniMajor;
    }

    public void setAlumniMajor(String alumniMajor) {
        this.alumniMajor = alumniMajor;
    }

    public String getAlumniGradyear() {
        return alumniGradyear;
    }

    public void setAlumniGradyear(String alumniGradyear) {
        this.alumniGradyear = alumniGradyear;
    }
}

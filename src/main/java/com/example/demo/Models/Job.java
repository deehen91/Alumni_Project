package com.example.demo.Models;


import javax.persistence.*;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int jobID;

    private int alumID;

    private int jobtitle;

    private int jobname;

    private int jobregion;

    private int jobphnum;

    private int jobdesc;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "alumID")

    private Alumni alumni;

}

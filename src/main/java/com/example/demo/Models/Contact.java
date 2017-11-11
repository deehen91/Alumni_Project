package com.example.demo.Models;

import javax.persistence.*;

@Entity

public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contID;

    private String alumID;
    private String alumnumber;
    private String alumemail;
    private String alum_add;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "alumID")
    private Alumni alumni;


}

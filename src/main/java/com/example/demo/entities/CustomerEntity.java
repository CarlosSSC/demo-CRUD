package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq_gen")
    @SequenceGenerator(name = "customer_seq_gen", sequenceName = "customer_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "firstname", columnDefinition = "varchar(60)", nullable = false)
    private String firstname;
    @Column(name = "lastname", columnDefinition = "varchar(60)", nullable = false)
    private String lastname;
    @Column(name = "country", columnDefinition = "varchar(60)", nullable = false)
    private String country;
    @Column(name = "phonenumber", nullable = false)
    private Integer phonenumber;

    public CustomerEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }
}

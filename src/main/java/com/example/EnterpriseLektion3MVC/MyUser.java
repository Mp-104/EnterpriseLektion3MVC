package com.example.EnterpriseLektion3MVC;


import jakarta.persistence.*;

@Entity
public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(unique = true)
    String name;
    int numberOfClicks;
    String password;

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

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

    public int getNumberOfClicks () {
        return numberOfClicks;
    }

    public void setNumberOfClicks (int numberOfClicks) {
        this.numberOfClicks = numberOfClicks;
    }
}

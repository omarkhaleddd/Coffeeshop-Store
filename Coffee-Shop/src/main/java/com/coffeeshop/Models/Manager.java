package com.coffeeshop.Models;

import com.coffeeshop.CoffeeShopApplication;
import com.coffeeshop.Customer;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import java.util.Objects;



@Entity
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String password;

    //There can be many employees managed by one customer.
    @OneToMany
    private ArrayList<Employee> Employees ;


    public Manager(Integer id, String name, String email, Integer age, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Manager() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.coffeeshop.Models.Manager Manager = (com.coffeeshop.Models.Manager) o;
        return Objects.equals(id, Manager.id) && Objects.equals(name, Manager.name) && Objects.equals(email, Manager.email) && Objects.equals(password, Manager.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password);
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                "password" + password +
                '}';
    }
}
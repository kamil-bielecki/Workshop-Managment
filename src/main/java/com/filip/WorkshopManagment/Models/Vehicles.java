package com.filip.WorkshopManagment.Models;

import javax.persistence.*;

@Entity
public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String model;
    private String reg;
    private String notes;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    public Vehicles(Long id, String brand, String model, String reg, String notes, Customer customer) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.reg = reg;
        this.notes = notes;
        this.customer = customer;
    }
    public String  customerFullName(){
        return customer.getFullName();
    }
    public Customer customerId(){
        customer.getId();
        return new Customer();
    }


    public Vehicles() {

    }

    public Customer getCustomer() {
        if(customer!= null) {
            customer.getId();
        }
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", reg='" + reg + '\'' +
                ", notes='" + notes + '\'' +
                ", customer=" + customer +
                '}';
    }
}
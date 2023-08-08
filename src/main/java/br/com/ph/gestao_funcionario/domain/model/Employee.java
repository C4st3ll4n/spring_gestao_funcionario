package br.com.ph.gestao_funcionario.domain.model;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.AUTO;

@Entity(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String phone;
    @OneToOne
    private Address address;
    @Column
    private String role;
    @Column
    private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

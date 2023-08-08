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
}

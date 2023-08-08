package br.com.ph.gestao_funcionario.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import static jakarta.persistence.GenerationType.AUTO;

@Entity(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @OneToOne
    private Employee employee;

    private String street;
    private String neighborhood;
    private String city;

    private String postalCode;
}

package br.com.ph.gestao_funcionario.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import static jakarta.persistence.GenerationType.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String name;
    private String phone;

}

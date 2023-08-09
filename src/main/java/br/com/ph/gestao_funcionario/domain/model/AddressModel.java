package br.com.ph.gestao_funcionario.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Table(name = "TB_ADDRESS")
public class AddressModel {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @OneToOne
    private EmployeeModel employeeModel;

    private String street;
    private String neighborhood;
    private String city;

    private String postalCode;

    public EmployeeModel getEmployee() {
        return employeeModel;
    }

    public void setEmployee(EmployeeModel employeeModel) {
        this.employeeModel = employeeModel;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

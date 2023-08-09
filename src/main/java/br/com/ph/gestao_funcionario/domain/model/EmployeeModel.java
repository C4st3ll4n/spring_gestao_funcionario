package br.com.ph.gestao_funcionario.domain.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Table(name = "TB_EMPLOYEE")
public class EmployeeModel implements Serializable {

    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = AUTO)
    private UUID id;
    @Column
    private String name;
    @Column
    private String phone;
    @OneToOne
    private AddressModel addressModel;
    @Column
    private String role;
    @Column
    private BigDecimal salary;

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

    public AddressModel getAddress() {
        return addressModel;
    }

    public void setAddress(AddressModel addressModel) {
        this.addressModel = addressModel;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}

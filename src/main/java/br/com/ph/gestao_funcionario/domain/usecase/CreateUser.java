package br.com.ph.gestao_funcionario.domain.usecase;

import br.com.ph.gestao_funcionario.domain.model.EmployeeModel;

public interface CreateUser {
    EmployeeModel add(String nome, String phone, String role, Double salary);
}

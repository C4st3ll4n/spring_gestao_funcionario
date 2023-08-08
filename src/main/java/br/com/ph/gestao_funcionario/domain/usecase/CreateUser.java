package br.com.ph.gestao_funcionario.domain.usecase;

import br.com.ph.gestao_funcionario.domain.model.Employee;

public interface CreateUser {
    public Employee add(String nome, String phone, String role, Double salary);
}

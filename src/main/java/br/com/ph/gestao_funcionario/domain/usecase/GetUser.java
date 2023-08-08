package br.com.ph.gestao_funcionario.domain.usecase;

import br.com.ph.gestao_funcionario.domain.model.Employee;

public interface GetUser {
    public Employee findById(long id);
}

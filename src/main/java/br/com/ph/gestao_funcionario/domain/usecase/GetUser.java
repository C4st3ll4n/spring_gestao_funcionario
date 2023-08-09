package br.com.ph.gestao_funcionario.domain.usecase;

import br.com.ph.gestao_funcionario.domain.model.EmployeeModel;

public interface GetUser {
    EmployeeModel findById(long id);
}

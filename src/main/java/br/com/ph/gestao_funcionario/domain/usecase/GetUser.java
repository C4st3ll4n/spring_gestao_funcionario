package br.com.ph.gestao_funcionario.domain.usecase;

import br.com.ph.gestao_funcionario.domain.model.EmployeeModel;

import java.util.UUID;

public interface GetUser {
    EmployeeModel findById(UUID id);
}

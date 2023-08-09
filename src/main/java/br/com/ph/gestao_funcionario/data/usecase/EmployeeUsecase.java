package br.com.ph.gestao_funcionario.data.usecase;

import br.com.ph.gestao_funcionario.domain.model.EmployeeModel;
import br.com.ph.gestao_funcionario.domain.usecase.CreateUser;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeUsecase extends CreateUser, CrudRepository<EmployeeModel, String> {
    EmployeeModel findById(long id);
}

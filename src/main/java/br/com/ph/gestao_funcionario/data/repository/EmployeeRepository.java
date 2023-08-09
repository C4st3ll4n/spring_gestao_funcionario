package br.com.ph.gestao_funcionario.data.repository;

import br.com.ph.gestao_funcionario.domain.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, UUID> {
}

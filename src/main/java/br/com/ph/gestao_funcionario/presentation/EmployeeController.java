package br.com.ph.gestao_funcionario.presentation;

import br.com.ph.gestao_funcionario.data.dto.EmployeeRecordDTO;
import br.com.ph.gestao_funcionario.data.repository.EmployeeRepository;
import br.com.ph.gestao_funcionario.domain.model.AddressModel;
import br.com.ph.gestao_funcionario.domain.model.EmployeeModel;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/employee")
    public ResponseEntity<EmployeeModel> saveEmployee(@RequestBody @Valid EmployeeRecordDTO employeeDTO) {
        var employeeModel = new EmployeeModel();

        BeanUtils.copyProperties(employeeDTO, employeeModel);


        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(employeeModel));
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Object> getEmployee(@PathVariable(value = "id") UUID id) {
        var employee = repository.findById(id);
        if (employee.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(employee.get());
    }

    @GetMapping("/employee")
    public ResponseEntity<List<EmployeeModel>> getAllEmployees() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }


    @PutMapping("/employee/{id}")
    public ResponseEntity<Object> updateEmployee(@PathVariable(value = "id") UUID id,
                                                 @RequestBody @Valid EmployeeRecordDTO employeeDTO) {
        Optional<EmployeeModel> employee = repository.findById(id);
        if (employee.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
        }

        var employeeModel = employee.get();
        BeanUtils.copyProperties(employeeDTO, employeeModel);

        return ResponseEntity.status(HttpStatus.OK).body(repository.save(employeeModel));
    }


    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Object> deleteEmployee(@PathVariable(value = "id") UUID id) {
        Optional<EmployeeModel> employee = repository.findById(id);
        if (employee.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
        }

        try {
            repository.delete(employee.get());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong during this action, try again in a few minutes.");
        }


        return ResponseEntity.status(HttpStatus.OK).body("Employee deleted successfully");
    }
}

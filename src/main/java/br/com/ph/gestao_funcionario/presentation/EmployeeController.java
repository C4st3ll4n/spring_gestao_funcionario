package br.com.ph.gestao_funcionario.presentation;

import br.com.ph.gestao_funcionario.data.dto.EmployeeRecordDTO;
import br.com.ph.gestao_funcionario.data.repository.EmployeeRepository;
import br.com.ph.gestao_funcionario.domain.model.EmployeeModel;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/employee")
    public ResponseEntity<EmployeeModel> saveProduct(@RequestBody @Valid EmployeeRecordDTO employeeDTO){
        var employeeModel = new EmployeeModel();
        BeanUtils.copyProperties(employeeDTO, employeeModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(employeeModel));
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Object> getProduct(@PathVariable(value = "id") UUID id){
        var product = repository.findById(id);
        if(product.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(product.get());
    }

    @GetMapping("/employee")
    public ResponseEntity<List<EmployeeModel>> getAllProducts(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }
}

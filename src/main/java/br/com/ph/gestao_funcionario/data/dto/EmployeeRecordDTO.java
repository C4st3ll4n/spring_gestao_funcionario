package br.com.ph.gestao_funcionario.data.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record EmployeeRecordDTO(@NotBlank String name, String phone, @NotBlank String role, @NotNull BigDecimal salary) {
}

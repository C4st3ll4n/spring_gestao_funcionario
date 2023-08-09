package br.com.ph.gestao_funcionario.domain.usecase;

import java.util.UUID;

public interface RemoveUser {
    void removeById(UUID id);
}

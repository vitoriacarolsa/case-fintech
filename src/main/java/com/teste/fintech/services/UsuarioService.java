package com.teste.fintech.services;

import com.teste.fintech.dto.UsuarioDTO;
import com.teste.fintech.entities.Usuario;
import com.teste.fintech.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional
    public UsuarioDTO insert  (UsuarioDTO dto){
        Usuario entity= new Usuario();
        copyDtoToEntity (dto, entity);
        entity= usuarioRepository.save(entity);
        return new UsuarioDTO(entity);
    }

    private void copyDtoToEntity(UsuarioDTO dto, Usuario entity) {
        entity.setName(dto.getName());
        entity.setIncome(dto.getIncome());
        entity.setLoanAmount(dto.getLoanAmount());
    }
}

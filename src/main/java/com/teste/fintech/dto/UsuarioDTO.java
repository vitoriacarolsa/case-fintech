package com.teste.fintech.dto;

import com.teste.fintech.entities.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class UsuarioDTO {

    private Long id;
    @NotBlank(message = "Campo requerido")
    private String name;
    @Positive(message = "Valor do empréstimo precisa ser positivo.")
    private Double loanAmount;
    @Positive(message = "Valor da renda mensal precisa ser positivo.")
    private Double income;

    public UsuarioDTO(Double income, Double loanAmount, String name, Long id) {
        this.income = income;
        this.loanAmount = loanAmount;
        this.name = name;
        this.id = id;
    }

    public UsuarioDTO (Usuario entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.loanAmount = entity.getLoanAmount();
        this.income = entity.getIncome();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }
}

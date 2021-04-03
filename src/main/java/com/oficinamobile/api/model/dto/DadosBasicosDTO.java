package com.oficinamobile.api.model.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DadosBasicosDTO {
	private String nome;
	private String cpf;
	private String rg; 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dtNascimento;
	private String observacao;
}

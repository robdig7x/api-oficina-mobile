package com.oficinamobile.api.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EnderecosDTO {
	private Integer cep;
	private String endereco;
	private String numero;
	private String complemento;
	private String estado;
	private String cidade;
	private String bairro;
	private String observacoes;
}

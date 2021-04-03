package com.oficinamobile.api.model.dto;

import com.oficinamobile.api.model.enums.TipoCliente;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SalaDTO {
	
	private String id;
	private String nome;
	private int lotacao;
	private TipoCliente tipo;
	
}

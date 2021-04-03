package com.oficinamobile.api.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContatosDTO {
	private Long celular;
	private Long telelefoneResidencial;
	private Long telefoneComercial;
	private String email;
	private String site;
	private String redeSocial;
	private String observacoes;
}

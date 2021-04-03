package com.oficinamobile.api.model;

import javax.persistence.Table;

import com.oficinamobile.api.model.dto.ContatosDTO;
import com.oficinamobile.api.model.dto.DadosBasicosDTO;
import com.oficinamobile.api.model.dto.EnderecosDTO;
import com.oficinamobile.api.model.enums.SituacaoCliente;
import com.oficinamobile.api.model.enums.TipoCliente;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name="clientes")
public class Cliente {
	private String id;
	private TipoCliente tipo;
	private SituacaoCliente situacao;
	private DadosBasicosDTO dadosBasicos;
	private ContatosDTO contatos;
	private EnderecosDTO enderecos;
}

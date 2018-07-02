package com.nelioalves.cursomc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE (1, "Pendente"),
	QUITADO (2, "Quitado"),
	CANCELADO (3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	//Construtor de tipo enumerado é PRIVATE.
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	//Só Getters, pois Enum não pode alterar valor
	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	//Método estático para devolver o tipo a partir de um código
	public static EstadoPagamento toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		//Varrer o Enum e retornar a descrição
		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			} 
		}
		
		throw new IllegalArgumentException("Id inválido " + cod);
	}


}

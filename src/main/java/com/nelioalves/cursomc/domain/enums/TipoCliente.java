package com.nelioalves.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	//Construtor de tipo enumerado é PRIVATE.
	private TipoCliente(int cod, String descricao) {
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
	public static TipoCliente toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		//Varrer o Enum e retornar a descrição
		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			} 
		}
		
		throw new IllegalArgumentException("Id inválido " + cod);
	}

}

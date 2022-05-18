package com.example.demo.model;


public class Calculo {
	private Integer retorno;
	private String servidor;

	public Calculo(int retorno, String servidor) {
		this.retorno = retorno;
		this.servidor = servidor;
	}

	public Integer getRetorno() {
		return retorno;
	}

	public void setRetorno(Integer retorno) {
		this.retorno = retorno;
	}

	public String getServidor() {
		return servidor;
	}

	public void setServidor(String servidor) {
		this.servidor = servidor;
	}
}

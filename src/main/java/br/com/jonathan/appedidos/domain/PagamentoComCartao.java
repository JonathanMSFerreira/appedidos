package br.com.jonathan.appedidos.domain;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento {
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer numeroParcelas;

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	
	
	
}

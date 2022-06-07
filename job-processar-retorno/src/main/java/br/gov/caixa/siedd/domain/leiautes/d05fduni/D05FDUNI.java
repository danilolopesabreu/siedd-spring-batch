package br.gov.caixa.siedd.domain.leiautes.d05fduni;

/**
 * Classe que representa o layout: D05FDUNI – Remessa de Agendamentos/Lançamentos
 */
public class D05FDUNI {
	
	private D05FDUNIHeader header;
	private D05FDUNITrailler trailler;

	public D05FDUNIHeader getHeader() {
		return header;
	}

	public void setHeader(D05FDUNIHeader header) {
		this.header = header;
	}

	public D05FDUNITrailler getTrailler() {
		return trailler;
	}

	public void setTrailler(D05FDUNITrailler trailler) {
		this.trailler = trailler;
	}

}

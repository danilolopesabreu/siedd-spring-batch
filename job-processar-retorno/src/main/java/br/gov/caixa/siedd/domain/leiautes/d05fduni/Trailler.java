package br.gov.caixa.siedd.domain.leiautes.d05fduni;

import org.springframework.batch.item.file.transform.Range;

public class Trailler {
	
	private short tpRegistro;
	private long qtRegistros;
	private long vrTotalRemessa;
	private long qtTotalEfetivado;
	private long vrTotalEfetivado;
	private String filler;
	
	public static Range[] getRange() {
		return new Range[]{ 
				 new Range(1,1)
				,new Range(2,19)
				,new Range(20,36)
				,new Range(37,54)
				,new Range(55,71)
				,new Range(72,1000)
			};
	}

	public short getTpRegistro() {
		return tpRegistro;
	}

	public void setTpRegistro(short tpRegistro) {
		this.tpRegistro = tpRegistro;
	}

	public long getQtRegistros() {
		return qtRegistros;
	}

	public void setQtRegistros(long qtRegistros) {
		this.qtRegistros = qtRegistros;
	}

	public long getVrTotalRemessa() {
		return vrTotalRemessa;
	}

	public void setVrTotalRemessa(long vrTotalRemessa) {
		this.vrTotalRemessa = vrTotalRemessa;
	}

	public long getQtTotalEfetivado() {
		return qtTotalEfetivado;
	}

	public void setQtTotalEfetivado(long qtTotalEfetivado) {
		this.qtTotalEfetivado = qtTotalEfetivado;
	}

	public long getVrTotalEfetivado() {
		return vrTotalEfetivado;
	}

	public void setVrTotalEfetivado(long vrTotalEfetivado) {
		this.vrTotalEfetivado = vrTotalEfetivado;
	}

	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}
	
	

}

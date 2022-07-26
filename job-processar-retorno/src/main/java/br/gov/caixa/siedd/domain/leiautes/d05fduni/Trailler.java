package br.gov.caixa.siedd.domain.leiautes.d05fduni;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	
	public static String[] getPropertiesName() {
		final List<String> propriedades = Stream.of(new Trailler().getClass().getDeclaredFields())
				.map(x -> x.getName() ).collect(Collectors.toList());
		return Arrays.copyOf(propriedades.toArray(), propriedades.toArray().length, String[].class);
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filler == null) ? 0 : filler.hashCode());
		result = prime * result + (int) (qtRegistros ^ (qtRegistros >>> 32));
		result = prime * result + (int) (qtTotalEfetivado ^ (qtTotalEfetivado >>> 32));
		result = prime * result + tpRegistro;
		result = prime * result + (int) (vrTotalEfetivado ^ (vrTotalEfetivado >>> 32));
		result = prime * result + (int) (vrTotalRemessa ^ (vrTotalRemessa >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trailler other = (Trailler) obj;
		if (filler == null) {
			if (other.filler != null)
				return false;
		} else if (!filler.equals(other.filler))
			return false;
		if (qtRegistros != other.qtRegistros)
			return false;
		if (qtTotalEfetivado != other.qtTotalEfetivado)
			return false;
		if (tpRegistro != other.tpRegistro)
			return false;
		if (vrTotalEfetivado != other.vrTotalEfetivado)
			return false;
		if (vrTotalRemessa != other.vrTotalRemessa)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Trailler [tpRegistro=" + tpRegistro + ", qtRegistros=" + qtRegistros + ", vrTotalRemessa="
				+ vrTotalRemessa + ", qtTotalEfetivado=" + qtTotalEfetivado + ", vrTotalEfetivado=" + vrTotalEfetivado
				+ ", filler=" + filler + "]";
	}
	
}

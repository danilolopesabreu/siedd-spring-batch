package br.gov.caixa.siedd.domain.leiautes.d05fduni;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.batch.item.file.transform.Range;

public class Header {

	private short tpRegistro;
	private short nuStcoMovimento;
	private String coTipoMensagem;
	private short nuMensagem;
	private String tpArquivo;
	private String dtGeracao;
	private String hrGeracao;
	private String dtMovimento;
	private short nuSegmento;
	private int nuRemessa;
	private String filler;
	
	public static Range[] getRange() {
		return new Range[]{ 
				 new Range(1,1)
				,new Range(2,3)
				,new Range(4,5)
				,new Range(6,9)
				,new Range(10,10)
				,new Range(11,18)
				,new Range(19,24)
				,new Range(25,32)
				,new Range(33,36)
				,new Range(37,45)
				,new Range(46,1000)
			};
	}
	
	public static String[] getPropertiesName() {
		final List<String> propriedades = Stream.of(new Header().getClass().getDeclaredFields())
				.map(x -> x.getName() ).collect(Collectors.toList());
		return Arrays.copyOf(propriedades.toArray(), propriedades.toArray().length, String[].class);
	}
	
	public short getTpRegistro() {
		return tpRegistro;
	}

	public void setTpRegistro(short tpRegistro) {
		this.tpRegistro = tpRegistro;
	}

	public short getNuStcoMovimento() {
		return nuStcoMovimento;
	}

	public void setNuStcoMovimento(short nuStcoMovimento) {
		this.nuStcoMovimento = nuStcoMovimento;
	}

	public String getCoTipoMensagem() {
		return coTipoMensagem;
	}

	public void setCoTipoMensagem(String coTipoMensagem) {
		this.coTipoMensagem = coTipoMensagem;
	}

	public short getNuMensagem() {
		return nuMensagem;
	}

	public void setNuMensagem(short nuMensagem) {
		this.nuMensagem = nuMensagem;
	}

	public String getTpArquivo() {
		return tpArquivo;
	}

	public void setTpArquivo(String tpArquivo) {
		this.tpArquivo = tpArquivo;
	}

	public String getDtGeracao() {
		return dtGeracao;
	}

	public void setDtGeracao(String dtGeracao) {
		this.dtGeracao = dtGeracao;
	}

	public String getHrGeracao() {
		return hrGeracao;
	}

	public void setHrGeracao(String hrGeracao) {
		this.hrGeracao = hrGeracao;
	}

	public String getDtMovimento() {
		return dtMovimento;
	}

	public void setDtMovimento(String dtMovimento) {
		this.dtMovimento = dtMovimento;
	}

	public short getNuSegmento() {
		return nuSegmento;
	}

	public void setNuSegmento(short nuSegmento) {
		this.nuSegmento = nuSegmento;
	}

	public int getNuRemessa() {
		return nuRemessa;
	}

	public void setNuRemessa(int nuRemessa) {
		this.nuRemessa = nuRemessa;
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
		result = prime * result + ((coTipoMensagem == null) ? 0 : coTipoMensagem.hashCode());
		result = prime * result + ((dtGeracao == null) ? 0 : dtGeracao.hashCode());
		result = prime * result + ((dtMovimento == null) ? 0 : dtMovimento.hashCode());
		result = prime * result + ((filler == null) ? 0 : filler.hashCode());
		result = prime * result + ((hrGeracao == null) ? 0 : hrGeracao.hashCode());
		result = prime * result + nuMensagem;
		result = prime * result + nuRemessa;
		result = prime * result + nuSegmento;
		result = prime * result + nuStcoMovimento;
		result = prime * result + ((tpArquivo == null) ? 0 : tpArquivo.hashCode());
		result = prime * result + tpRegistro;
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
		Header other = (Header) obj;
		if (coTipoMensagem == null) {
			if (other.coTipoMensagem != null)
				return false;
		} else if (!coTipoMensagem.equals(other.coTipoMensagem))
			return false;
		if (dtGeracao == null) {
			if (other.dtGeracao != null)
				return false;
		} else if (!dtGeracao.equals(other.dtGeracao))
			return false;
		if (dtMovimento == null) {
			if (other.dtMovimento != null)
				return false;
		} else if (!dtMovimento.equals(other.dtMovimento))
			return false;
		if (filler == null) {
			if (other.filler != null)
				return false;
		} else if (!filler.equals(other.filler))
			return false;
		if (hrGeracao == null) {
			if (other.hrGeracao != null)
				return false;
		} else if (!hrGeracao.equals(other.hrGeracao))
			return false;
		if (nuMensagem != other.nuMensagem)
			return false;
		if (nuRemessa != other.nuRemessa)
			return false;
		if (nuSegmento != other.nuSegmento)
			return false;
		if (nuStcoMovimento != other.nuStcoMovimento)
			return false;
		if (tpArquivo == null) {
			if (other.tpArquivo != null)
				return false;
		} else if (!tpArquivo.equals(other.tpArquivo))
			return false;
		if (tpRegistro != other.tpRegistro)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Header [tpRegistro=" + tpRegistro + ", nuStcoMovimento=" + nuStcoMovimento + ", coTipoMensagem="
				+ coTipoMensagem + ", nuMensagem=" + nuMensagem + ", tpArquivo=" + tpArquivo + ", dtGeracao="
				+ dtGeracao + ", hrGeracao=" + hrGeracao + ", dtMovimento=" + dtMovimento + ", nuSegmento=" + nuSegmento
				+ ", nuRemessa=" + nuRemessa + ", filler=" + filler + "]";
	}

}

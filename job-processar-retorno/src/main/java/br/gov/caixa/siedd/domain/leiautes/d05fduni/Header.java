package br.gov.caixa.siedd.domain.leiautes.d05fduni;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.batch.item.file.transform.Range;

public class Header {

	private short tpRegistro;
	private short nuStcoMovimento;
	private String coTipoMensagem;
	private short nuMensagem;
	private short tpArquivo;
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
		return (String[]) propriedades.toArray();
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

	public short getTpArquivo() {
		return tpArquivo;
	}

	public void setTpArquivo(short tpArquivo) {
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

}

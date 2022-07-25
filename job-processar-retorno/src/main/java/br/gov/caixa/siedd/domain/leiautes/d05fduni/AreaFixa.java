package br.gov.caixa.siedd.domain.leiautes.d05fduni;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.batch.item.file.transform.Range;

public class AreaFixa {
	
	private short tpRegistro;
	private short nuVersaoLeiaute;
	private short nuStcoMovimento;
	private String coTipoMensagem;
	private short nuMensagem;
	private int nuRemessa;
	private int nuNsuNsgd;
	private String deMensagem;
	private long nuOrdem;
	private String filler_121_130;
	private short nuAcao;
	private short nuModo;
	private short nuGrupo;
	private short nuSubGrupo;
	private short nuTipo;
	private short nuSubTipo;
	private short nuProduto;
	private long nuConta;
	private short nuDvConta;
	private short nuUnidadeInformada;
	private String dtProgramada;
	private short nuSegmentoOrigem;
	private short nuNsuOrigem;
	private short nuSegmentoInter;
	private short nuNsuInter;
	private String icCondicional;
	private String filler_227;
	private short nuDocumento;
	private long vrMinimo;
	private long vrSolicitado;
	private long vrEfetivo;
	private long nuDescricaoLancto;
	private int nuUnidadeVigente;
	private String dtFimProgramada;
	private short nuCanal;
	private String icConsideraCrot;
	private String filler_312_400;
	private String areaVariavel;
	
	public static Range[] getRange() {
		return new Range[] {
				 new Range(1,1)
				,new Range(2,4)
				,new Range(5,6)
				,new Range(7,8)
				,new Range(9,12)
				,new Range(13,21)
				,new Range(22,30)
				,new Range(31,110)
				,new Range(111,120)
				,new Range(121,130)
				,new Range(131,132)
				,new Range(133,134)
				,new Range(135,136)
				,new Range(137,139)
				,new Range(140,143)
				,new Range(144,147)
				,new Range(148,151)
				,new Range(152,163)
				,new Range(164,164)
				,new Range(165,169)
				,new Range(170,177)
				,new Range(178,181)
				,new Range(182,201)
				,new Range(202,205)
				,new Range(206,226)
				,new Range(227,227)
				,new Range(228,233)
				,new Range(234,250)
				,new Range(251,267)
				,new Range(268,284)
				,new Range(285,293)
				,new Range(294,298)
				,new Range(299,306)
				,new Range(307,310)
				,new Range(311,311)
				,new Range(312,400)
				,new Range(401,1000)
		};
	}
	
	public static String[] getPropertiesName() {
		final List<String> propriedades = Stream.of(new AreaFixa().getClass().getDeclaredFields())
				.map(x -> x.getName() ).collect(Collectors.toList());
		return (String[]) propriedades.toArray();
	}

	public short getTpRegistro() {
		return tpRegistro;
	}

	public void setTpRegistro(short tpRegistro) {
		this.tpRegistro = tpRegistro;
	}

	public short getNuVersaoLeiaute() {
		return nuVersaoLeiaute;
	}

	public void setNuVersaoLeiaute(short nuVersaoLeiaute) {
		this.nuVersaoLeiaute = nuVersaoLeiaute;
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

	public int getNuRemessa() {
		return nuRemessa;
	}

	public void setNuRemessa(int nuRemessa) {
		this.nuRemessa = nuRemessa;
	}

	public int getNuNsuNsgd() {
		return nuNsuNsgd;
	}

	public void setNuNsuNsgd(int nuNsuNsgd) {
		this.nuNsuNsgd = nuNsuNsgd;
	}

	public String getDeMensagem() {
		return deMensagem;
	}

	public void setDeMensagem(String deMensagem) {
		this.deMensagem = deMensagem;
	}

	public long getNuOrdem() {
		return nuOrdem;
	}

	public void setNuOrdem(long nuOrdem) {
		this.nuOrdem = nuOrdem;
	}

	public String getFiller_121_130() {
		return filler_121_130;
	}

	public void setFiller_121_130(String filler_121_130) {
		this.filler_121_130 = filler_121_130;
	}

	public short getNuAcao() {
		return nuAcao;
	}

	public void setNuAcao(short nuAcao) {
		this.nuAcao = nuAcao;
	}

	public short getNuModo() {
		return nuModo;
	}

	public void setNuModo(short nuModo) {
		this.nuModo = nuModo;
	}

	public short getNuGrupo() {
		return nuGrupo;
	}

	public void setNuGrupo(short nuGrupo) {
		this.nuGrupo = nuGrupo;
	}

	public short getNuSubGrupo() {
		return nuSubGrupo;
	}

	public void setNuSubGrupo(short nuSubGrupo) {
		this.nuSubGrupo = nuSubGrupo;
	}

	public short getNuTipo() {
		return nuTipo;
	}

	public void setNuTipo(short nuTipo) {
		this.nuTipo = nuTipo;
	}

	public short getNuSubTipo() {
		return nuSubTipo;
	}

	public void setNuSubTipo(short nuSubTipo) {
		this.nuSubTipo = nuSubTipo;
	}

	public short getNuProduto() {
		return nuProduto;
	}

	public void setNuProduto(short nuProduto) {
		this.nuProduto = nuProduto;
	}

	public long getNuConta() {
		return nuConta;
	}

	public void setNuConta(long nuConta) {
		this.nuConta = nuConta;
	}

	public short getNuDvConta() {
		return nuDvConta;
	}

	public void setNuDvConta(short nuDvConta) {
		this.nuDvConta = nuDvConta;
	}

	public short getNuUnidadeInformada() {
		return nuUnidadeInformada;
	}

	public void setNuUnidadeInformada(short nuUnidadeInformada) {
		this.nuUnidadeInformada = nuUnidadeInformada;
	}

	public String getDtProgramada() {
		return dtProgramada;
	}

	public void setDtProgramada(String dtProgramada) {
		this.dtProgramada = dtProgramada;
	}

	public short getNuSegmentoOrigem() {
		return nuSegmentoOrigem;
	}

	public void setNuSegmentoOrigem(short nuSegmentoOrigem) {
		this.nuSegmentoOrigem = nuSegmentoOrigem;
	}

	public short getNuNsuOrigem() {
		return nuNsuOrigem;
	}

	public void setNuNsuOrigem(short nuNsuOrigem) {
		this.nuNsuOrigem = nuNsuOrigem;
	}

	public short getNuSegmentoInter() {
		return nuSegmentoInter;
	}

	public void setNuSegmentoInter(short nuSegmentoInter) {
		this.nuSegmentoInter = nuSegmentoInter;
	}

	public short getNuNsuInter() {
		return nuNsuInter;
	}

	public void setNuNsuInter(short nuNsuInter) {
		this.nuNsuInter = nuNsuInter;
	}

	public String getIcCondicional() {
		return icCondicional;
	}

	public void setIcCondicional(String icCondicional) {
		this.icCondicional = icCondicional;
	}

	public String getFiller_227() {
		return filler_227;
	}

	public void setFiller_227(String filler_227) {
		this.filler_227 = filler_227;
	}

	public short getNuDocumento() {
		return nuDocumento;
	}

	public void setNuDocumento(short nuDocumento) {
		this.nuDocumento = nuDocumento;
	}

	public long getVrMinimo() {
		return vrMinimo;
	}

	public void setVrMinimo(long vrMinimo) {
		this.vrMinimo = vrMinimo;
	}

	public long getVrSolicitado() {
		return vrSolicitado;
	}

	public void setVrSolicitado(long vrSolicitado) {
		this.vrSolicitado = vrSolicitado;
	}

	public long getVrEfetivo() {
		return vrEfetivo;
	}

	public void setVrEfetivo(long vrEfetivo) {
		this.vrEfetivo = vrEfetivo;
	}

	public long getNuDescricaoLancto() {
		return nuDescricaoLancto;
	}

	public void setNuDescricaoLancto(long nuDescricaoLancto) {
		this.nuDescricaoLancto = nuDescricaoLancto;
	}

	public int getNuUnidadeVigente() {
		return nuUnidadeVigente;
	}

	public void setNuUnidadeVigente(int nuUnidadeVigente) {
		this.nuUnidadeVigente = nuUnidadeVigente;
	}

	public String getDtFimProgramada() {
		return dtFimProgramada;
	}

	public void setDtFimProgramada(String dtFimProgramada) {
		this.dtFimProgramada = dtFimProgramada;
	}

	public short getNuCanal() {
		return nuCanal;
	}

	public void setNuCanal(short nuCanal) {
		this.nuCanal = nuCanal;
	}

	public String getIcConsideraCrot() {
		return icConsideraCrot;
	}

	public void setIcConsideraCrot(String icConsideraCrot) {
		this.icConsideraCrot = icConsideraCrot;
	}

	public String getFiller_312_400() {
		return filler_312_400;
	}

	public void setFiller_312_400(String filler_312_400) {
		this.filler_312_400 = filler_312_400;
	}

	public String getAreaVariavel() {
		return areaVariavel;
	}

	public void setAreaVariavel(String areaVariavel) {
		this.areaVariavel = areaVariavel;
	}
	
}

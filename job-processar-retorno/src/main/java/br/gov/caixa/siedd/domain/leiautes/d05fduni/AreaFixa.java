package br.gov.caixa.siedd.domain.leiautes.d05fduni;

import java.math.BigInteger;
import java.util.Arrays;
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
	private String nuOrdem;
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
	private BigInteger nuNsuOrigem;
	private short nuSegmentoInter;
	private BigInteger nuNsuInter;
	private String icCondicional;
	private String filler_227;
	private short nuDocumento;
	private long vrMinimo;
	private long vrSolicitado;
	private long vrEfetivo;
	private long nuDescricaoLancto;
	private int nuUnidadeVigente;
	private String dtFimProgramada;
	private String nuCanal;
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
				 ,new Range(206,225)
				 ,new Range(226,226)
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
		return Arrays.copyOf(propriedades.toArray(), propriedades.toArray().length, String[].class);
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

	public String getNuOrdem() {
		return nuOrdem;
	}

	public void setNuOrdem(String nuOrdem) {
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

	public BigInteger getNuNsuOrigem() {
		return nuNsuOrigem;
	}

	public void setNuNsuOrigem(BigInteger nuNsuOrigem) {
		this.nuNsuOrigem = nuNsuOrigem;
	}

	public short getNuSegmentoInter() {
		return nuSegmentoInter;
	}

	public void setNuSegmentoInter(short nuSegmentoInter) {
		this.nuSegmentoInter = nuSegmentoInter;
	}

	public BigInteger getNuNsuInter() {
		return nuNsuInter;
	}

	public void setNuNsuInter(BigInteger nuNsuInter) {
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

	public String getNuCanal() {
		return nuCanal;
	}

	public void setNuCanal(String nuCanal) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaVariavel == null) ? 0 : areaVariavel.hashCode());
		result = prime * result + ((coTipoMensagem == null) ? 0 : coTipoMensagem.hashCode());
		result = prime * result + ((deMensagem == null) ? 0 : deMensagem.hashCode());
		result = prime * result + ((dtFimProgramada == null) ? 0 : dtFimProgramada.hashCode());
		result = prime * result + ((dtProgramada == null) ? 0 : dtProgramada.hashCode());
		result = prime * result + ((filler_121_130 == null) ? 0 : filler_121_130.hashCode());
		result = prime * result + ((filler_227 == null) ? 0 : filler_227.hashCode());
		result = prime * result + ((filler_312_400 == null) ? 0 : filler_312_400.hashCode());
		result = prime * result + ((icCondicional == null) ? 0 : icCondicional.hashCode());
		result = prime * result + ((icConsideraCrot == null) ? 0 : icConsideraCrot.hashCode());
		result = prime * result + nuAcao;
		result = prime * result + ((nuCanal == null) ? 0 : nuCanal.hashCode());
		result = prime * result + (int) (nuConta ^ (nuConta >>> 32));
		result = prime * result + (int) (nuDescricaoLancto ^ (nuDescricaoLancto >>> 32));
		result = prime * result + nuDocumento;
		result = prime * result + nuDvConta;
		result = prime * result + nuGrupo;
		result = prime * result + nuMensagem;
		result = prime * result + nuModo;
		result = prime * result + ((nuNsuInter == null) ? 0 : nuNsuInter.hashCode());
		result = prime * result + nuNsuNsgd;
		result = prime * result + ((nuNsuOrigem == null) ? 0 : nuNsuOrigem.hashCode());;
		result = prime * result + ((nuOrdem == null) ? 0 : nuOrdem.hashCode());
		result = prime * result + nuProduto;
		result = prime * result + nuRemessa;
		result = prime * result + nuSegmentoInter;
		result = prime * result + nuSegmentoOrigem;
		result = prime * result + nuStcoMovimento;
		result = prime * result + nuSubGrupo;
		result = prime * result + nuSubTipo;
		result = prime * result + nuTipo;
		result = prime * result + nuUnidadeInformada;
		result = prime * result + nuUnidadeVigente;
		result = prime * result + nuVersaoLeiaute;
		result = prime * result + tpRegistro;
		result = prime * result + (int) (vrEfetivo ^ (vrEfetivo >>> 32));
		result = prime * result + (int) (vrMinimo ^ (vrMinimo >>> 32));
		result = prime * result + (int) (vrSolicitado ^ (vrSolicitado >>> 32));
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
		AreaFixa other = (AreaFixa) obj;
		if (areaVariavel == null) {
			if (other.areaVariavel != null)
				return false;
		} else if (!areaVariavel.equals(other.areaVariavel))
			return false;
		if (coTipoMensagem == null) {
			if (other.coTipoMensagem != null)
				return false;
		} else if (!coTipoMensagem.equals(other.coTipoMensagem))
			return false;
		if (deMensagem == null) {
			if (other.deMensagem != null)
				return false;
		} else if (!deMensagem.equals(other.deMensagem))
			return false;
		if (dtFimProgramada == null) {
			if (other.dtFimProgramada != null)
				return false;
		} else if (!dtFimProgramada.equals(other.dtFimProgramada))
			return false;
		if (dtProgramada == null) {
			if (other.dtProgramada != null)
				return false;
		} else if (!dtProgramada.equals(other.dtProgramada))
			return false;
		if (filler_121_130 == null) {
			if (other.filler_121_130 != null)
				return false;
		} else if (!filler_121_130.equals(other.filler_121_130))
			return false;
		if (filler_227 == null) {
			if (other.filler_227 != null)
				return false;
		} else if (!filler_227.equals(other.filler_227))
			return false;
		if (filler_312_400 == null) {
			if (other.filler_312_400 != null)
				return false;
		} else if (!filler_312_400.equals(other.filler_312_400))
			return false;
		if (icCondicional == null) {
			if (other.icCondicional != null)
				return false;
		} else if (!icCondicional.equals(other.icCondicional))
			return false;
		if (icConsideraCrot == null) {
			if (other.icConsideraCrot != null)
				return false;
		} else if (!icConsideraCrot.equals(other.icConsideraCrot))
			return false;
		if (nuAcao != other.nuAcao)
			return false;
		if (nuCanal == null) {
			if (other.nuCanal != null)
				return false;
		} else if (!nuCanal.equals(other.nuCanal))
			return false;
		if (nuConta != other.nuConta)
			return false;
		if (nuDescricaoLancto != other.nuDescricaoLancto)
			return false;
		if (nuDocumento != other.nuDocumento)
			return false;
		if (nuDvConta != other.nuDvConta)
			return false;
		if (nuGrupo != other.nuGrupo)
			return false;
		if (nuMensagem != other.nuMensagem)
			return false;
		if (nuModo != other.nuModo)
			return false;
		if (nuNsuInter == null) {
			if (other.nuNsuInter != null)
				return false;
		} else if (!nuNsuInter.equals(other.nuNsuInter))
			return false;
		if (nuNsuNsgd != other.nuNsuNsgd)
			return false;
		if (nuNsuOrigem != other.nuNsuOrigem)
			return false;
		if (nuOrdem == null) {
			if (other.nuOrdem != null)
				return false;
		} else if (!nuOrdem.equals(other.nuOrdem))
			return false;
		if (nuProduto != other.nuProduto)
			return false;
		if (nuRemessa != other.nuRemessa)
			return false;
		if (nuSegmentoInter != other.nuSegmentoInter)
			return false;
		if (nuSegmentoOrigem != other.nuSegmentoOrigem)
			return false;
		if (nuStcoMovimento != other.nuStcoMovimento)
			return false;
		if (nuSubGrupo != other.nuSubGrupo)
			return false;
		if (nuSubTipo != other.nuSubTipo)
			return false;
		if (nuTipo != other.nuTipo)
			return false;
		if (nuUnidadeInformada != other.nuUnidadeInformada)
			return false;
		if (nuUnidadeVigente != other.nuUnidadeVigente)
			return false;
		if (nuVersaoLeiaute != other.nuVersaoLeiaute)
			return false;
		if (tpRegistro != other.tpRegistro)
			return false;
		if (vrEfetivo != other.vrEfetivo)
			return false;
		if (vrMinimo != other.vrMinimo)
			return false;
		if (vrSolicitado != other.vrSolicitado)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AreaFixa [tpRegistro=" + tpRegistro + ", nuVersaoLeiaute=" + nuVersaoLeiaute + ", nuStcoMovimento="
				+ nuStcoMovimento + ", coTipoMensagem=" + coTipoMensagem + ", nuMensagem=" + nuMensagem + ", nuRemessa="
				+ nuRemessa + ", nuNsuNsgd=" + nuNsuNsgd + ", deMensagem=" + deMensagem + ", nuOrdem=" + nuOrdem
				+ ", filler_121_130=" + filler_121_130 + ", nuAcao=" + nuAcao + ", nuModo=" + nuModo + ", nuGrupo="
				+ nuGrupo + ", nuSubGrupo=" + nuSubGrupo + ", nuTipo=" + nuTipo + ", nuSubTipo=" + nuSubTipo
				+ ", nuProduto=" + nuProduto + ", nuConta=" + nuConta + ", nuDvConta=" + nuDvConta
				+ ", nuUnidadeInformada=" + nuUnidadeInformada + ", dtProgramada=" + dtProgramada
				+ ", nuSegmentoOrigem=" + nuSegmentoOrigem + ", nuNsuOrigem=" + nuNsuOrigem + ", nuSegmentoInter="
				+ nuSegmentoInter + ", nuNsuInter=" + nuNsuInter + ", icCondicional=" + icCondicional + ", filler_227="
				+ filler_227 + ", nuDocumento=" + nuDocumento + ", vrMinimo=" + vrMinimo + ", vrSolicitado="
				+ vrSolicitado + ", vrEfetivo=" + vrEfetivo + ", nuDescricaoLancto=" + nuDescricaoLancto
				+ ", nuUnidadeVigente=" + nuUnidadeVigente + ", dtFimProgramada=" + dtFimProgramada + ", nuCanal="
				+ nuCanal + ", icConsideraCrot=" + icConsideraCrot + ", filler_312_400=" + filler_312_400
				+ ", areaVariavel=" + areaVariavel + "]";
	}
	
}

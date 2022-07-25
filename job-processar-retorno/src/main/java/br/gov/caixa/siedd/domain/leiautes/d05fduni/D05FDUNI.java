package br.gov.caixa.siedd.domain.leiautes.d05fduni;

import org.springframework.batch.item.file.transform.Range;

import br.gov.caixa.siedd.domain.util.SpringRange;

/**
 * Classe que representa o layout: D05FDUNI – Remessa de Agendamentos/Lançamentos
 */
public class D05FDUNI  {
	
	private Header header;
	private AreaFixa areaFixa;
	private Trailler trailler;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Trailler getTrailler() {
		return trailler;
	}

	public void setTrailler(Trailler trailler) {
		this.trailler = trailler;
	}
	
	public AreaFixa getAreaFixa() {
		return areaFixa;
	}

	public void setAreaFixa(AreaFixa areaFixa) {
		this.areaFixa = areaFixa;
	}

	public static void main(String[] args) {
		Range[] arrayConcat = SpringRange.concatWithArrayCopy(
					  new Range[]{ new Range(1,2),  new Range(3,4 )}
					, new Range[]{ new Range(5,6),  new Range(7,8 )}
  				    , new Range[]{ new Range(9,10),  new Range(11,12 )}
					, new Range[]{ new Range(13,14),  new Range(15,16 )}  
				);
		
		for (int i = 0; i < arrayConcat.length; i++) {
			System.out.println(arrayConcat[i]);
		}
	}
}

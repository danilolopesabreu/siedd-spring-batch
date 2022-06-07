package br.gov.caixa.siedd.domain.leiautes.d05fduni;

import org.springframework.batch.item.file.transform.Range;

import br.gov.caixa.siedd.domain.util.SpringRange;

/**
 * Classe que representa o layout: D05FDUNI – Remessa de Agendamentos/Lançamentos
 */
public class D05FDUNI implements SpringRange {
	
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

	@Override
	public Range[] getRange() {
		return SpringRange.concatWithArrayCopy(
						  this.header.getRange()
						, this.trailler.getRange());
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

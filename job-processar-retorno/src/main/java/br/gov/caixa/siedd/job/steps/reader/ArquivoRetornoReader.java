package br.gov.caixa.siedd.job.steps.reader;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemStreamReader;

import br.gov.caixa.siedd.domain.leiautes.d05fduni.AreaFixa;
import br.gov.caixa.siedd.domain.leiautes.d05fduni.D05FDUNI;
import br.gov.caixa.siedd.domain.leiautes.d05fduni.Header;
import br.gov.caixa.siedd.domain.leiautes.d05fduni.Trailler;

public class ArquivoRetornoReader implements ItemStreamReader<D05FDUNI> {
	
	private Object objAtual;
	private ItemStreamReader<D05FDUNI> delegate;
	private D05FDUNI leiauteUnico = new D05FDUNI();
	
	public ArquivoRetornoReader(ItemStreamReader<D05FDUNI> delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {
		delegate.open(executionContext);
	}

	@Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {
		delegate.update(executionContext);
	}

	@Override
	public void close() throws ItemStreamException {
		delegate.close();
	}

	@Override
	public D05FDUNI read() throws Exception {
		objAtual = delegate.read();

		if(isObjectAreaFixa(objAtual)) {
			AreaFixa areaFixa = (AreaFixa) objAtual;
			leiauteUnico.setAreaFixa(areaFixa);
		}
		
		if(isObjectHeader(objAtual)) {
			leiauteUnico.setHeader((Header) objAtual);
		}
		
		if(isObjectTrailler(objAtual)) {
			leiauteUnico.setTrailler((Trailler)objAtual);
		}
		
		if(objAtual == null)//base case
			return null;
		
		return leiauteUnico;
	}
	
	private boolean isObjectHeader(Object obj) {
		return obj instanceof Header;
	}

	private boolean isObjectTrailler(Object obj) {
		return obj instanceof Trailler;
	}
	
	private boolean isObjectAreaFixa(Object obj) {
		return obj instanceof AreaFixa;
	}
}
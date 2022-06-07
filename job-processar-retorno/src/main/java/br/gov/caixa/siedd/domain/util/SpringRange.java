package br.gov.caixa.siedd.domain.util;

import org.springframework.batch.item.file.transform.Range;

public interface SpringRange {
	public Range[] getRange();
}

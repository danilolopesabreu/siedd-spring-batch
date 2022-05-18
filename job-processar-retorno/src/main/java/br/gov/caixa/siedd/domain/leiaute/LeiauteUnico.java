package br.gov.caixa.siedd.domain.leiaute;

import br.gov.caixa.siedd.domain.leiaute.d05fduni.AreaVariavel;
import br.gov.caixa.siedd.domain.leiaute.d05fduni.D05fduniAreaFixa;
import br.gov.caixa.siedd.domain.leiaute.d05fduni.D05fduniHeader;
import br.gov.caixa.siedd.domain.leiaute.d05fduni.D05fduniTrailler;

/**
 * Classe que representa o layout: D05FDUNI – Remessa de Agendamentos/Lançamentos
 * */
public class LeiauteUnico {
	D05fduniHeader d05fduniHeader;
	D05fduniAreaFixa areaFixa;
	AreaVariavel areaVariavel;
	D05fduniTrailler d05fduniTrailler;
}

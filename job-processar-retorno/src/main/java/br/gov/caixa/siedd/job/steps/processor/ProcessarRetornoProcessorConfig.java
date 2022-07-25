package br.gov.caixa.siedd.job.steps.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.gov.caixa.siedd.domain.leiautes.d05fduni.D05FDUNI;

@Configuration
public class ProcessarRetornoProcessorConfig {
	
	@Bean
	public ItemProcessor<D05FDUNI, D05FDUNI> arquivoRetornoProcessor() throws Exception {
		ValidatingItemProcessor<D05FDUNI> processor = new ValidatingItemProcessor<D05FDUNI>();
		processor.setValidator(validator());
		return processor;
	}

	private Validator<D05FDUNI> validator() {
		return new Validator<D05FDUNI>() {
			@Override
			public void validate(D05FDUNI leiauteUnico) throws ValidationException {
				
				if(leiauteUnico.getHeader() != null)
					System.out.println(" ... "+leiauteUnico);
				
			}
			
		};
	}
}

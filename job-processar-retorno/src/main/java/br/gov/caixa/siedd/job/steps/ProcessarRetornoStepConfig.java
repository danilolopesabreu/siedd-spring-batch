package br.gov.caixa.siedd.job.steps;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.gov.caixa.siedd.domain.leiautes.d05fduni.D05FDUNI;
import br.gov.caixa.siedd.job.steps.reader.ArquivoRetornoReader;

@Configuration
public class ProcessarRetornoStepConfig {

	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Bean
	public Step stepProcessarRetorno(
			FlatFileItemReader<D05FDUNI> arquivoRetornoItemReader,
			ItemProcessor<D05FDUNI, D05FDUNI> arquivoRetornoProcessor,
			ItemWriter<D05FDUNI> arquivoRetornoWriter) {
		return stepBuilderFactory
				.get("stepProcessarRetorno")
				.<D05FDUNI, D05FDUNI> chunk(20)
				.reader(new ArquivoRetornoReader(arquivoRetornoItemReader))
				.processor(arquivoRetornoProcessor)
				.writer(arquivoRetornoWriter)
				.build();
	}
}

package br.gov.caixa.siedd.job.steps.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessarRetornoWriterConfig {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public ItemWriter arquivoRetornoWriter() {
		return items -> items.forEach(System.out::println);
	}
	
}

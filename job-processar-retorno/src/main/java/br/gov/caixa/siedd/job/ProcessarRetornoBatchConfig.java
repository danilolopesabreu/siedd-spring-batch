package br.gov.caixa.siedd.job;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class ProcessarRetornoBatchConfig {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;

}

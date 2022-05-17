package br.gov.caixa.siedd.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessarRetornoStepConfig {

	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Bean
	public Step stepProcessarRetorno(Tasklet testeTasklet) {
		return this.stepBuilderFactory
				.get("stepProcessarRetorno")
				.tasklet(testeTasklet)
				.build();
	}
}

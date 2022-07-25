package br.gov.caixa.siedd.job.steps.reader;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.mapping.PatternMatchingCompositeLineMapper;
import org.springframework.batch.item.file.transform.FixedLengthTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.gov.caixa.siedd.domain.leiautes.d05fduni.AreaFixa;
import br.gov.caixa.siedd.domain.leiautes.d05fduni.Header;
import br.gov.caixa.siedd.domain.leiautes.d05fduni.Trailler;

@Configuration
public class ClienteTransacaoLineMapperConfig {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public PatternMatchingCompositeLineMapper lineMapper() {
		PatternMatchingCompositeLineMapper lineMapper = new PatternMatchingCompositeLineMapper<>();
		lineMapper.setTokenizers(tokenizers());
		lineMapper.setFieldSetMappers(fieldSetMappers());
		return lineMapper;
	}

	@SuppressWarnings("rawtypes")
	private Map<String, FieldSetMapper> fieldSetMappers() {
		Map<String, FieldSetMapper> fieldSetMappers = new HashMap<>();
		fieldSetMappers.put("1*", fieldSetMapper(Header.class));
		fieldSetMappers.put("2*", fieldSetMapper(AreaFixa.class));
		fieldSetMappers.put("9*", fieldSetMapper(Trailler.class));
		return fieldSetMappers;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private FieldSetMapper fieldSetMapper(Class classe) {
		BeanWrapperFieldSetMapper fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(classe);
		return fieldSetMapper;
	}

	/**
	 * identify the pattern between lines 
	 * */
	private Map<String, LineTokenizer> tokenizers() {
		Map<String, LineTokenizer> tokenizers = new HashMap<>();
		tokenizers.put("1*", headerLineTokenizer());
		tokenizers.put("2*", areaFixaLineTokenizer());
		tokenizers.put("9*", traillerLineTokenizer());
		return tokenizers;
	}

	private LineTokenizer headerLineTokenizer() {
		FixedLengthTokenizer lineTokenizer = new FixedLengthTokenizer();
		lineTokenizer.setColumns(Header.getRange());
		lineTokenizer.setNames(Header.getPropertiesName());
		return lineTokenizer;
	}

	private LineTokenizer traillerLineTokenizer() {
		FixedLengthTokenizer lineTokenizer = new FixedLengthTokenizer();
		lineTokenizer.setColumns(Trailler.getRange());
		lineTokenizer.setNames(Trailler.getPropertiesName());
		return lineTokenizer;
	}

	private LineTokenizer areaFixaLineTokenizer() {
		FixedLengthTokenizer lineTokenizer = new FixedLengthTokenizer();
		lineTokenizer.setColumns(AreaFixa.getRange());
		lineTokenizer.setNames(AreaFixa.getPropertiesName());
		return lineTokenizer;
	}
}
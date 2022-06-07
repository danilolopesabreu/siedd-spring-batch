package br.gov.caixa.siedd.domain.util;

import java.util.Arrays;

import org.springframework.batch.item.file.transform.Range;

public interface SpringRange {
	
	public Range[] getRange();
	
	private static Range[] concatWithArrayCopy(Range[] array1, Range[] array2) {
		Range[] result = Arrays.copyOf(array1, array1.length + array2.length);
	    System.arraycopy(array2, 0, result, array1.length, array2.length);
	    return result;
	}
	
	/**
	 * Concatena os arrays em ordem de parametro arr1+arr2+arr3....
	 * */
	public static Range[] concatWithArrayCopy(Range[] ...array) {
		if(array == null)
			throw new NullPointerException("VarArgs de Array nao pode ser nulo.");
		
		if(array.length <= 1)
			return array[0];
		
		Range[] concatenado = concatWithArrayCopy(array[0], array[1]);
		
		for (int i = 2; i < array.length; i++) {
			Range[] atual = concatenado;
			Range[] proximo = array[i];
			concatenado = concatWithArrayCopy(atual, proximo);
		}
		
	    return concatenado;
	}
	
}

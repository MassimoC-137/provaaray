package it.prova.provaarray.test;

import java.util.Arrays;

import it.prova.provaarray.utility.ArrayUtility;

public class TestArrayUtility {

	public static void main(String[] args) {

//		int[] valoriPerTestSommaElementi = { 2, 5, 7, 8, 3 };
//		System.out.println(ArrayUtility.sommaElementi(valoriPerTestSommaElementi));
//
//		int[] valoriPerTestPariNegativo = { 6, 3, 9, -2, 4, -9, 8, -4 };
//		System.out.println(ArrayUtility.esisteAlmenoUnNegativoPari(valoriPerTestPariNegativo));
//
//		System.out.println(ArrayUtility.contaQuantiSonoNegativiPari(valoriPerTestPariNegativo));
//
//		int[] valoriTestAlContrario = { 67, -12, 8, 2, -19, 1, -3 };
//		System.out.println(ArrayUtility.sommaElementiIndiceDispariAlContrario(valoriTestAlContrario));
//
//		System.out.println(ArrayUtility.esistenzaNumero(valoriPerTestSommaElementi, 5));
//
//		System.out.println(ArrayUtility.dimmiSeTantiDispariQuantiPari(valoriPerTestSommaElementi));
//
//		int[] valoriTestDivisibiliPer = { 2, 4, 8, 16, 32, 64 };
//		System.out.println(ArrayUtility.quantiSonoDivisibiliPer(valoriTestDivisibiliPer, 4));
//
//		int[] verificaOrdineDecrescente = { 9, 7, 6, 4, 3, 2, 1 };
//		System.out.println(ArrayUtility.verificaSeOrdineDecrescente(verificaOrdineDecrescente));
//
//		System.out.println(ArrayUtility.tuttiINumeriPari(valoriTestDivisibiliPer));
//
//		int[] perNuovoArray = { 72, -36, 18, 54, 90 };
//	
//		for (int i = 0; i < ret.length; i++) {
//			System.out.println(ret[i]);
//			
//		}
//
//			int[] rett = ArrayUtility.riempiConNumeroDaSottrarreSuperioreAZero(perNuovoArray, 20);
//			for (int j = 0; j < rett.length; j++) {
//
//				System.out.println("array non negativo " + rett[j]);
//		}
//			
//		int[] numeroNonRipetuto = {14, 86, 58, 23, 0, 79, 0};
//		System.out.println(ArrayUtility.presenteSoloUnaVolta(numeroNonRipetuto, 0));
//		
//		int[] arrayPrimo = {1, 2, 3, 4, 5, 6}; 
//		int[] arrayInvertito = ArrayUtility.creaArrayInvertito(arrayPrimo);
//		for (int i = 0; i < arrayInvertito.length; i++) {
//			System.out.println(arrayInvertito[i]);
//		}
//		
//		int[] arrayPieno = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0}; 
//		int[] nuovoArray = ArrayUtility.cancellaElementoArray(arrayPieno, 0); 
//		for (int i = 0; i < nuovoArray.length; i++) {
//			System.out.println(nuovoArray[i]);
//		}
//
//		int[] numeriRandom = {3, 7, 40, 17, 1, 9, 0, -5, -8}; 
//		int[] numeriOrdinati = ArrayUtility.ordineCrescente(numeriRandom);
//		for (int i = 0; i < numeriRandom.length; i++) {
//			System.out.println(numeriOrdinati[i]);
//		}
//		
//		
//		
//		int[] arrayOrdinato = {1, 3, 5, 7, 9, 13, 15, 17}; 
//		int numeroDaCercare = 5; 
//		System.out.println(ArrayUtility.cercaNumeroConArrayOrdinato(arrayOrdinato, numeroDaCercare));
//		
//		String parola = "aiuole"; 
//		System.out.println(ArrayUtility.caratteriOrdinatiDiStringa(parola));
//
//		char[] ret = ArrayUtility.caratteriOrdinatiDiStringa("aiuole");
//		System.out.println(Arrays.toString(ret));
//		
//		
//		int[] array = {1, 2, 5, 6, 7, 8, 10, 12}; 
//		int numero = 10; 
//		System.out.println(ArrayUtility.cercaNumeroConArrayOrdinatoRicorsivo(array, numero)); 
//		
//		int[] valori = {2, 4, 8, 16, 32, 64, 128}; 
//		int divisore = 8; 
//		int[] ret = ArrayUtility.riempiArrayConMultipliDiEnne(valori, divisore);
//		System.out.println(Arrays.toString(ret));
//		
//		int[] arrayPalindromo = {1, 2, 3, 4, 3, 2, 1}; 
//		System.out.println(ArrayUtility.controllaSeArrayPalindromo(arrayPalindromo));
//		
		int[] array = {1, 2, 9, 4, 5, 6, 7}; 
		int elemento = 3; 
		int posizione = 2; 
//		int[] nuovoArray = ArrayUtility.inserisciElemento(array, elemento, posizione); 
//		System.out.println(Arrays.toString(nuovoArray));
//		
//		System.out.println(ArrayUtility.sommaIntervallo(array, 2, 5));
//		
//		int[] arrayInteri = {32, 7, 15, -9, 5, 90, 101, -50}; 
//		int[] minimoEMassimo = ArrayUtility.trovaMaxMin(arrayInteri); 
//		for (int i = 0; i < minimoEMassimo.length; i++) {
//			System.out.println(minimoEMassimo[i]);
//		}
		
		int[] arrayCoppie = {2, 4, 2, 2, 1, 1, 1}; 
		
//		System.out.println(ArrayUtility.contaQuanteCoppieUguali(arrayCoppie));
//		
//		System.out.println(ArrayUtility.trovaIndiceMassimo(array));
		
		int[] arrayModa = {1, 3, 1, 5, 2, 4, 1, 6, 2, 1}; 
		System.out.println("La moda dell'array inserito è: " + ArrayUtility.trovaModa(arrayModa));
		
	}

}






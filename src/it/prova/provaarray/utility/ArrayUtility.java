package it.prova.provaarray.utility;
import java.io.Console;
import java.util.*;

public class ArrayUtility {

	// Questo metodo somma elementi interni ad un array

	public static int sommaElementi(int[] valori) {

		int somma = 0;
		for (int i = 0; i < valori.length; i++) {
			somma += valori[i];
		}
		return somma;
	}

	// Secondo metodo controlla nell'array se c'è almeno un numero pari negativo
	public static boolean esisteAlmenoUnNegativoPari(int[] input) {

		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0 && input[i] % 2 == 0) {
				return true;
			}
		}
		return false;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static int contaQuantiSonoNegativiPari(int[] inputValori) {

		int negapar = 0;
		for (int i = 0; i < inputValori.length; i++) {
			if (inputValori[i] < 0 && inputValori[i] % 2 == 0)
				negapar++;
		}
		return negapar;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static int sommaElementiIndiceDispariAlContrario(int[] numeri) {

		int somma = 0;
		for (int i = numeri.length - 1; i >= 0; i--) {
			if (numeri[i] % 2 != 0) {
				somma += numeri[i];
			}
		}
		return somma;
	}

	// voglio sapere se nell'array esiste un numero che è uguale al 5 iterando al
	// contrario
	public static boolean esistenzaNumero(int[] array, int numeroDaCercare) {

		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == numeroDaCercare) {
				return true;
			}
		}
		return false;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static boolean dimmiSeTantiDispariQuantiPari(int[] array) {

		int contaPari = 0;
		int contaDispari = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {
				contaPari++;
			}

			else {
				contaDispari++;
			}
		}
		if (contaDispari == contaPari) {
			return true;
		}
		return false;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static int quantiSonoDivisibiliPer(int[] valori, int divisore) {

		int quantiNumeri = 0;
		for (int i = 0; i < valori.length; i++) {

			if (valori[i] % divisore == 0) {
				quantiNumeri++;
			}
		}
		return quantiNumeri;

	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static boolean verificaSeOrdineDecrescente(int[] valori) {

		for (int i = 0; i < valori.length - 1; i++) {

			if (valori[i] < valori[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static boolean tuttiINumeriPari(int[] input) {

		for (int i = 0; i < input.length; i++) {

			if (input[i] % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static int[] riempiConNumeroDaSottrarre(int[] valori, int numeroDaSottrarre) {

		int[] nuovoArray = new int[valori.length];
		for (int i = 0; i < valori.length; i++) {

			nuovoArray[i] = valori[i] - numeroDaSottrarre;

		}
		return nuovoArray;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static int[] riempiConNumeroDaSottrarreSuperioreAZero(int[] valori, int numeroDaSottrarre) {

		int[] nuovoArray = new int[valori.length];
		for (int i = 0; i < valori.length; i++) {

			if (valori[i] <= 0 || valori[i] < numeroDaSottrarre) {
				nuovoArray[i] = 0;
			} else {
				nuovoArray[i] = valori[i] - numeroDaSottrarre;
			}

		}
		return nuovoArray;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static boolean presenteSoloUnaVolta(int[] arrayIngresso, int arrayNumero) {

		int conta = 0;
		for (int i = 0; i < arrayIngresso.length; i++) {

			if (arrayIngresso[i] == arrayNumero) {
				conta++;
			}

		}

		if (conta != 1) {
			return false;
		}
		return true;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static int[] creaArrayInvertito(int[] valori) {

		int[] nuovoArrayValoriInvertiti = new int[valori.length];
		for (int i = 0; i < valori.length; i++) {

			nuovoArrayValoriInvertiti[i] = valori[valori.length - 1 - i];
		}
		return nuovoArrayValoriInvertiti;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static int[] cancellaElementoArray(int[] arrayPieno, int daEliminare) {

		int contaRipetizioni = 0;
		for (int j = 0; j < arrayPieno.length; j++) {
			if (arrayPieno[j] == daEliminare) {
				contaRipetizioni++;
			}
		}
		int[] arrayMezzoPieno = new int[arrayPieno.length - contaRipetizioni];
		int index = 0;
		for (int i = 0; i < arrayPieno.length; i++) {
			if (arrayPieno[i] != daEliminare) {
				arrayMezzoPieno[index] = arrayPieno[i];
				index++;
			}
		}
		return arrayMezzoPieno;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static int[] ordineCrescente(int[] numeriRandom) {

		for (int i = 0; i < numeriRandom.length; i++) {
			for (int j = i; j < numeriRandom.length; j++) {
				if (numeriRandom[i] > numeriRandom[j]) {
					int min = numeriRandom[i];
					numeriRandom[i] = numeriRandom[j];
					numeriRandom[j] = min;
				}
			}
		}
		return numeriRandom;
	}

	// ++++++++++++++++++++++++++++++++++++++++++
//	
//	public static int[] aggiungiInCoda(int[] arrayPiuCorto, int valoreDaAggiungereInCoda) {
//		
//		int[] arrayPiuLungo = new int[arrayPiuCorto.length + 1]; 
//		for (int i = 0; i < arrayPiuCorto.length; i++) {
//			arrayPiuLungo = arrayPiuCorto 
//		}
//		
//	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static boolean cercaNumeroConArrayOrdinato(int[] array, int numero) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) {
				return true;
			}
		}
		return false;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static char[] caratteriOrdinatiDiStringa(String frase) {

		char[] arrayOrdinato = new char[frase.length()]; // creo array vuoto di lunghezza "frase"
		for (int i = 0; i < frase.length(); i++) { // ciclo for
			arrayOrdinato[i] = frase.charAt(i); // indice di array è uguale a "frase"
		}
		for (int i = 0; i < arrayOrdinato.length; i++) {
			for (int j = i; j < arrayOrdinato.length; j++) {
				if (arrayOrdinato[i] > arrayOrdinato[j]) {
					char min = arrayOrdinato[i];
					arrayOrdinato[i] = arrayOrdinato[j];
					arrayOrdinato[j] = min;
				}
			}
		}
		return arrayOrdinato;
	}

	// ++++++++++++++++++++++++++++++++++++++++++
	
	// funzione ricorsiva dato un'array di interi e un intero va a cercare l'intero dentro l'array 
    // divindendo l'array in piccoli array
	
	public static boolean cercaNumeroConArrayOrdinatoRicorsivo(int[] array, int numero) {

		if (array[0] > numero || array[array.length - 1] < numero) {
			return false;
		}
		
		if (array[array.length/2] == numero) {
			return true;
		} else {
			if (array[array.length/2] < numero) {
				int[] nuovoArray = new int[array.length/2]; 
				for (int i = 0; i < nuovoArray.length; i++) {
					nuovoArray[i] = array[array.length/2 + i];
				}
				return ArrayUtility.cercaNumeroConArrayOrdinatoRicorsivo(nuovoArray, numero);
			} else {
				int [] nuovoArray = new int [array.length/2]; 
				for (int i = 0; i < nuovoArray.length; i++) {
					nuovoArray[i] = array[i]; 
				}
				return ArrayUtility.cercaNumeroConArrayOrdinatoRicorsivo(nuovoArray, numero);
			}
		}
		

	}


	// ++++++++++++++++++++++++++++++++++++++++++

	public static int[] riempiArrayConMultipliDiEnne (int[] valori, int multipli) {
		
		int quantiValori = 0; 
		for (int i = 0; i < valori.length; i++) {
			if (valori[i] % multipli == 0) {
				quantiValori ++;
			}
		}
		int index = 0;
		int[] valoriDivisibiliPer = new int [quantiValori];
		for (int i = 0; i < valori.length; i++) {
			if (valori[i] % multipli == 0) {
				valoriDivisibiliPer[index] = valori[i];
				index++;
			}
		}
		return valoriDivisibiliPer; 
		
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public static boolean controllaSeArrayPalindromo(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] != array[array.length -1 -i]) {
				return false;
			}

		}
		return true;
		
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public static int[] inserisciElemento(int[] array, int elemento, int posizione) {
		
		int nuovaPosizione = 0; 
		int[] arrayUltimo = new int [array.length + 1]; 
		for (int i = 0; i < array.length +1; i++) {
			if (i != posizione) {
				arrayUltimo[i] = array[nuovaPosizione];
				nuovaPosizione++; 
			}
		}
		arrayUltimo[posizione] = elemento;
		return arrayUltimo;
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public static int sommaIntervallo(int[] array, int inizio, int fine) { 
		
		int sommaTotale = 0; 
		for (int i = 0; i < array.length; i++) {
			if (i >= inizio && i <= fine) {
				sommaTotale += array[i]; 
			}
		}
		return sommaTotale;
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public static int[] trovaMaxMin(int[] arrayInteri) {
		
		int minimo = arrayInteri[0]; 
		int massimo = arrayInteri[0]; 
		for (int i = 1; i < arrayInteri.length; i++) {
			if (arrayInteri[i] > massimo) {
				massimo = arrayInteri[i];
			}
			if (arrayInteri[i] < minimo) {
				minimo = arrayInteri[i]; 
			}
		}	
		int[] risultatoMinMax = {minimo, massimo}; 
		return risultatoMinMax; 
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	
	public static int contaQuanteCoppieUguali(int[] arrayDiCoppie) {
		
		int coppie = 0; 
		for (int i = 0; i < arrayDiCoppie.length -1; i ++) {
			for (int j = i + 1; j < arrayDiCoppie.length ; j ++) {
				if (arrayDiCoppie[j] == arrayDiCoppie[i] && i != j) {
					coppie ++;
				}
			}
		}
		return coppie; 
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public static int trovaIndiceMassimo(int[] array) {
		
		int indice = 0; 
		int numeroMassimo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > numeroMassimo) {
				numeroMassimo = array[i];
				indice = i;
			}
			
		}
		return (indice);
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public static int trovaModa(int[] arrayModa) {
		
		if (arrayModa.length == 0) {
			return 0;
		}
		int moda = arrayModa[0]; 
		int conteggioMax = 0; 
		for (int i = 0; i < arrayModa.length; i++) {
			int conteggio = 0; 
			for (int j = 0; j < arrayModa.length; j++) {
				if (arrayModa[i] == arrayModa[j]) {
					conteggio++;
				}
			}
			if (conteggio > conteggioMax) {
				conteggioMax = conteggio; 
				moda = arrayModa[i];
			}
		}
		return moda; 
	}
	
	
	
	
	
}











package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Nel progetto java-oop-valutazioni, package jana60.valutazioni inserire due classi:
Classe Studente con tre attributi: id dello studente (intero), percentuale assenze (intero), media voti (numero decimale). La classe deve avere un costruttore con parametri e anche un metodo che calcola, in base a percentuale delle assenze e media dei voti, se lo studente è promosso o bocciato
Classe Main con metodo main in cui create un array di studenti (i dati degli studenti possono essere chiesti all’utente oppure inseriti nel codice con dei valori di test). L’id di ogni studente deve essere univoco nell’array (possiamo usare un numero progressivo). Il programma deve poi stampare a video per ogni studente se è stato promosso o bocciato e quanti studenti sono stati promossi in tutto.
*/
		int numStudenti;
		Scanner scan =new Scanner (System.in);
		System.out.println("Inserire numero studenti: ");
		numStudenti = Integer.parseInt(scan.nextLine());
		
		Studente[] listaStudenti = new Studente[numStudenti];
		for(int i=0; i < numStudenti; i++) {
			System.out.println("Inserire percentuale assenze studente: ");
			int temp1 = Integer.parseInt(scan.nextLine());
			System.out.println("Inserire media voti studente: ");
			float temp2 = Float.parseFloat(scan.nextLine());
			
			listaStudenti[i] = new Studente(i, temp1, temp2);
			
		}
		int numPromossi = 0;
		for(int i = 0; 1 < numStudenti; i++) {
			listaStudenti[i].setassenzeStudente(listaStudenti[i].assenzeStudente);
			listaStudenti[i].setmediaVotiStudente(listaStudenti[i].mediaVotiStudente);
			
			System.out.format("%1s %2s %1s %1s %8s %1s %1s", listaStudenti[i].idStudente, " ", listaStudenti[i].calcolaAmmissione(), " ");
			System.out.println("");
			if (listaStudenti[i].calcolaAmmissione().equals("Promosso")) {
				++numPromossi;
			}
		}
		
		System.out.format("512S %1S %2o", "TOT.PROMOSSI", " ", numPromossi);
		scan.close();
	}

}

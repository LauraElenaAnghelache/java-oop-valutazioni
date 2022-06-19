package jana60.valutazioni;

public class Studente {

		/* State costruendo un programma per un corso di studi.
La valutazione complessiva viene fatta sulla percentuale di assenze (da 0 a 100) e sulla media dei voti (da 0 a 5):
- se lo studente ha fatto più del 50% di assenze è bocciato
- se ha fatto tra il 25% e il 50% di assenze è promosso solo se la media dei voti è superiore a 2
- se ha fatto meno del 25% di assenze è promosso se la media dei voti è superiore o uguale a 2
*/
   int idStudente, assenzeStudente;
   float mediaVotiStudente;           //ATTRIBUTI
   
   Studente(int idStudente, int assenzeStudente, float mediaVotiStudente){
	   this.idStudente = idStudente;
	   this.assenzeStudente = assenzeStudente;
	   this.mediaVotiStudente = mediaVotiStudente;
   }                                 //COSTRUTTORI
   
  String calcolaAmmissione() {
	  if ((assenzeStudente >= 25 && assenzeStudente <=50) && mediaVotiStudente > 2) {
		  return "Promosso";
	  }
	  else if (assenzeStudente < 25 && mediaVotiStudente >= 2) {
		  return "Promosso";
	  }
	  else {
		  return "Bocciato";
	  }
	  
	  
  }
  void setassenzeStudente( int assenzeStudente) {
	  if(assenzeStudente > 100) {
		  this.assenzeStudente = 100;
	  }
	  else if (assenzeStudente < 0) {
		  this.assenzeStudente = 0;
	  }
	  
  }
   
  void setmediaVotiStudente(float mediaVotiStudente) {
	 if(mediaVotiStudente > 5) {
		 this.mediaVotiStudente = 5;
	 }
	 else if (mediaVotiStudente < 0) {
		 this.mediaVotiStudente = 0;
	 }
	   
  }
}
   

 

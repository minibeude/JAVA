package centre.visite;

public class TailleIncorrecteException extends Exception {
public TailleIncorrecteException() {
	System.out.println("La taille est inférieure à 40");
}
}

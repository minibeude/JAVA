package centre.visite;

public class TailleIncorrecteException extends Exception {
public TailleIncorrecteException() {
	System.out.println("La taille est inf�rieure � 40");
}
}

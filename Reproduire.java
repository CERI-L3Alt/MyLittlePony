package classe;
import java.util.Random;

public class Reproduire extends Action{
	Random enceinte = new Random();
	
	public Reproduire() {
		super();
	}
	
	//Faire un Random pour changer la variable enceinte
	private boolean Reproduction(){
		return enceinte.nextBoolean();
	}
}

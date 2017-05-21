package classe;
public class Punir extends Action{

	public Punir(String pun){
		super();
	}
	
	private void Punition(Tamagotchi tama){
		int valeurJoie = 0;
		int valeurSante = 0;
  
		valeurJoie = 8;
		valeurSante = 4;
	         
		this.moinsJoie(valeurJoie, tama);
		this.moinsHygiene(valeurSante, tama);
	}
}

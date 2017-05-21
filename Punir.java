
public class Punir extends Action{
	String nomPunition;
	
	public Punir(String pun){
		super();
		this.nomPunition = pun;
	}
	
	private void Punition(String pun, Tamagotchi tama){
		int valeurJoie = 0;
		int valeurSante = 0;
  
		valeurJoie = 8;
		valeurSante = 4;
	         
		this.moinsJoie(valeurJoie, tama);
		this.moinsHygiene(valeurSante, tama);
	}
}

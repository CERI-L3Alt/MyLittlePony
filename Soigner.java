package classe;
public class Soigner extends Action{
	
	public Soigner(){
		super();
	}
	
	public void Soin(Tamagotchi tama){
		int valeurJoie = 0;
		int valeurSoin = 0;
  
		valeurJoie = 3;
		valeurSoin = 6;
	         
		this.moinsJoie(valeurJoie,tama);
		this.plusSante(valeurSoin,tama);
	}
}

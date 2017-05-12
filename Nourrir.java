import java.util.Hashtable;

public class Nourrir extends Action{
	Aliment nomAlim = new Aliment();
	
	public Nourrir(Aliment nomA){
		super();
		this.nomAlim = nomA;
	}
	
	// Verifier si l'aliment est present
	private void Manger(String nomA){
		int valeurJoie = 0;
		int valeurSante = 0;
		int valeurHygiene = 0;
		int valeurFaim = 0;
  
		valeurJoie = 8;
		valeurSante = 4;
	         
		this.moinsJoie(valeurJoie);
		this.moinsHygiene(valeurSante);
		
		boolean verification = false;
		String msgManque = "L'aliment n'est pas encore disponible";
		switch(nomA) {
		case "Carotte" :
			if(this.nomAlim.getValue(nomA) == true){
				this.nomAlim.putValues(nomA,false);
				valeurJoie = 3;
				valeurSante = 2;
				valeurHygiene = 1;
				valeurFaim = 4;
			}else{
				System.out.print(msgManque);
			}
			break;
		case "Pomme" :
			if(this.nomAlim.getValue(nomA) == true){
				this.nomAlim.putValues(nomA,false);
				valeurJoie = 2;
				valeurSante = 2;
				valeurHygiene = 2;
				valeurFaim = 5;
			}else{
				System.out.print(msgManque);
			}
			break;
		case "Foin" :
			if(this.nomAlim.getValue(nomA) == true){
				this.nomAlim.putValues(nomA,false);
				valeurJoie = 1;
				valeurSante = 2;
				valeurHygiene = 1;
				valeurFaim = 5;
			}else{
				System.out.print(msgManque);
			}
			break;
		default :
			System.out.print("L'aliment choisit n'existe pas");
			break;
		}
		
		this.plusJoie(valeurJoie);
		this.moinsHygiene(valeurHygiene);
		this.moinsFaim(valeurFaim);
		this.moinsSante(valeurSante);
	}
	
	private void ReaparitionAlim(){
		boolean verif = false;
		
		for(int i = 0; i <= this.nomAlim.getAllValues().length; i++){
			if(this.nomAlim.getAllValues()[i] == true){
				return;
			}
		}
		this.nomAlim.putValues("Carotte",false);
		this.nomAlim.putValues("Pomme",false);
		this.nomAlim.putValues("Foin",false);
	}
}

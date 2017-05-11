
public class Jouer extends ActionLongue{
	String[] nomJeu = new String[3];;
	int difficulte;
	
	public Jouer(int dif){
		super();
		this.nomJeu[0] = "Chevauché";
		this.nomJeu[1] = "Saut de haies";
		this.nomJeu[2] = "Marche au pas";
		this.difficulte = dif;
	}
	
	protected void choixJeu(String nomJ, int dif, int duree) throws InterruptedException{
		int valeurJoie = 0;
		int valeurFatigue = 0;
		int valeurFaim = 0;
		Thread.sleep(duree*60000);
		switch (nomJ) {
         case "Chevauché": 
	        	 if(dif == 1){
	        		 valeurJoie = 1*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }else if(dif == 2){
	        		 valeurJoie = 2*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }else if(dif == 3){
	        		 valeurJoie = 3*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }
	              break;
         case "Saut de haies":
	        	 if(dif == 1){
	        		 valeurJoie = 2*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }else if(dif == 2){
	        		 valeurJoie = 3*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }else if(dif == 3){
	        		 valeurJoie = 4*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }
                  break;
         case "Marche au pas":  
	        	 if(dif == 1){
	        		 valeurJoie = 3*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }else if(dif == 2){
	        		 valeurJoie = 4*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }else if(dif == 3){
	        		 valeurJoie = 5*duree;
	        		 valeurFatigue = duree;
	        		 valeurFaim = duree;
	        	 }
                  break;
         default: 
                  break;

		}
		this.plusJoie(valeurJoie);
		this.plusFatigue(valeurFatigue);
		this.plusFaim(valeurFaim);
	}
	
	
	/*private int modifDifficulte(int dif){
		return dif;
	}*/
}

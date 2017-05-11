import java.util.Hashtable;

public class Aliment {
	Hashtable<String,Boolean> Alim= new Hashtable<String,Boolean>();
	
	public Aliment(String Ali){
		Alim.put("Carotte",true);
		Alim.put("Pomme",true);
		Alim.put("Foin",true);
	}
}

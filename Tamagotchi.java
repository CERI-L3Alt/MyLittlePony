package classe;
import java.awt.Image;

public class Tamagotchi {
	
	private String nomTama;
	private Image avatar;
	private int sante;
	private int faim;
	private int hygienne;
	private int joie;
	private int tempVie;
	
	// Getter //
	public String get_nomTama()
	{
		return nomTama;
	}
	public Image get_avatar()
	{
		return avatar;
	}
	public int get_sante()
	{
		return sante;
	}
	public int get_faim()
	{
		return faim;
	}
	public int get_hygienne()
	{
		return hygienne;
	}
	public int get_joie()
	{
		return joie;
	}
	public int get_tempVie()
	{
		return tempVie;
	}

	// Setter //
	public void set_nomTama(String _nomTama)
	{
		this.nomTama = _nomTama;
	}
	public void set_avatar(Image _avatar)
	{
		this.avatar = _avatar;
	}
	public void set_sante(int _sante)
	{
		this.sante = _sante;
	}
	public void set_faim(int _faim)
	{
		this.faim = _faim;
	}
	public void set_hygienne(int _hygienne)
	{
		this.hygienne = _hygienne;
	}
	public void set_joie(int _joie)
	{
		this.joie = _joie;
	}
	public void set_tempVie(int _tempVie)
	{
		this.tempVie = _tempVie;
	}
	
	// Methodes //
	public Tamagotchi(String _nomTama, Image _avatar, int _sante, int _faim, int _hygienne, int _joie, int _tempVie)
	{
		nomTama = _nomTama;
		avatar = _avatar;
		sante = _sante;
		faim = _faim;
		hygienne = _hygienne;
		joie = _joie;
		tempVie = _tempVie;
	}
}

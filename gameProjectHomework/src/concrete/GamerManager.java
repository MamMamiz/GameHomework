package concrete;

import abstracts.IGamerService;
import entitites.Gamer;

public class GamerManager implements IGamerService{

	@Override
	public void add(Gamer gamer) {
		
		System.out.println("Kay�t i�lemi tamamland�" + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
	
		System.out.println("Sistemden " + gamer.getFirstName() + " adl� ki�i silindi ");
		
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println("Bilgileriniz g�ncellendi " + gamer.getFirstName());
	}

	@Override
	public void check(Gamer gamer) {
		
		
		
		System.out.println("Bilgileriniz kontrol edildi " + gamer.getFirstName());
		
	}
	
	

}

package concrete;

import abstracts.IGamerService;
import entitites.Gamer;

public class GamerManager implements IGamerService{

	@Override
	public void add(Gamer gamer) {
		
		System.out.println("Kayýt iþlemi tamamlandý" + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
	
		System.out.println("Sistemden " + gamer.getFirstName() + " adlý kiþi silindi ");
		
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println("Bilgileriniz güncellendi " + gamer.getFirstName());
	}

	@Override
	public void check(Gamer gamer) {
		
		
		
		System.out.println("Bilgileriniz kontrol edildi " + gamer.getFirstName());
		
	}
	
	

}

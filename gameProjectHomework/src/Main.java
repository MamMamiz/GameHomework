import concrete.GameManager;
import concrete.GamerManager;
import entitites.Campaign;
import entitites.Game;
import entitites.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer (1 , "Muhammet ", "Çakýr " ,"15806385123", 2000);
		
		
		Game game1 = new Game (100, "Pubg", "Oynamayaný dövüyorlar o kadar diyim sen anla ! " , 74.99);
		
		
		Campaign campaign1 = new Campaign (1000, "Black Friday "," Yýlda bir kere gelen efsane fýrsatlarý kaçýrma !" ,45);

		
		GameManager gameManager1 = new GameManager();
		gameManager1.add(game1);
		gameManager1.addCampaign(game1, campaign1);
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.update(gamer1);
		
		
	}

}

import concrete.GameManager;
import concrete.GamerManager;
import entitites.Campaign;
import entitites.Game;
import entitites.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer (1 , "Muhammet ", "�ak�r " ,"15806385123", 2000);
		
		
		Game game1 = new Game (100, "Pubg", "Oynamayan� d�v�yorlar o kadar diyim sen anla ! " , 74.99);
		
		
		Campaign campaign1 = new Campaign (1000, "Black Friday "," Y�lda bir kere gelen efsane f�rsatlar� ka��rma !" ,45);

		
		GameManager gameManager1 = new GameManager();
		gameManager1.add(game1);
		gameManager1.addCampaign(game1, campaign1);
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.update(gamer1);
		
		
	}

}

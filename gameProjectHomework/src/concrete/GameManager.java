package concrete;

import abstracts.IGameService;
import entitites.Campaign;
import entitites.Game;


public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		
		System.out.println(game.getName() + " isimli oyun eklendi ! ");
		
		
	}

	@Override
	public void update(Game game) {
		
		System.out.println(game.getName() + " isimli oyun silindi ! ");
		
	}

	@Override
	public void sell(Game game) {
		
		System.out.println(game.getName() + " isimli oyun güncellendi ! ");
		
	}

	@Override
	public void addCampaign(Game game, Campaign campaign) {
		
		double newPrice = game.getUnitPrice() * campaign.getDiscountRate() /100;
		game.setUnitPrice(newPrice);
		
		System.out.println("Yeni ürün fiyatý = " + game.getUnitPrice());
		
		
	}

}

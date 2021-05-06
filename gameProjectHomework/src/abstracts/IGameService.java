package abstracts;

import entitites.Campaign;

import entitites.Game;


public interface IGameService {
	
	void add (Game game);
	
	void update (Game game );
	
	void sell (Game game);

	void addCampaign (Game game , Campaign campaign);
}

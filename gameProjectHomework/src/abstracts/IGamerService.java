package abstracts;

import entitites.Gamer;

public interface IGamerService {
	
	void add(Gamer gamer);
	
	void delete (Gamer gamer);
	
	void update(Gamer gamer);
	
	void check (Gamer gamer);

}

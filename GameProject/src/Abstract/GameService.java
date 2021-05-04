package Abstract;

import Entities.Customer;
import Entities.Game;

public interface GameService {
	void sell(Customer customer, Game game);
	void add(Game game);
	void updated(Game game);
	void delete(Game game);
}

package Concrete;

import Abstract.GameService;
import Entities.Customer;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void sell(Customer customer, Game game) {
		System.out.println("Succesfuly game  is buyed." + customer.getFirstName());
		MultiplyLogger.MultiplyLog(game.getName());
	}

	@Override
	public void add(Game game) {
		System.out.println("Game is added." + game.getName());
		MultiplyLogger.MultiplyLog(game.getName());
	}

	@Override
	public void updated(Game game) {
		System.out.println("Game is uptadet." + game.getName());		
		MultiplyLogger.MultiplyLog(game.getName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game is deleted." + game.getName());		
		MultiplyLogger.MultiplyLog(game.getName());
	}

}

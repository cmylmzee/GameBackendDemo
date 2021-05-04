import Concrete.CampainManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setName("Yaz indirimi");
		campaign.setDiscount(10);
		
		Game game = new Game();
		game.setId(1);
		game.setName("Gta5");
		game.setUnitPrice(125);
		
		Customer customer = new Customer();
		customer.setBirthOfYear(2002);
		customer.setFirstName("Cem");
		customer.setId(1);
		customer.setLastName("Yýlmaz");
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(customer);
		System.out.println("-------------------");
		customerManager.delete(customer);
		System.out.println("-------------------");
		customerManager.update(customer);
		System.out.println("-------------------");
		
		CampainManager campainManager = new CampainManager();
		campainManager.add(campaign, game);
		System.out.println("-------------------");
		campainManager.delete(campaign);
		System.out.println("-------------------");
		campainManager.update(campaign);
		System.out.println("-------------------");
		
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		System.out.println("-------------------");
		gameManager.delete(game);
		System.out.println("-------------------");
		gameManager.sell(customer, game);
		System.out.println("-------------------");
	
	}

}

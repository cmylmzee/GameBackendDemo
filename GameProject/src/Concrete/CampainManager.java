package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampainManager implements CampaignService {

	@Override
	public void add(Campaign campaign,Game game) {
		System.out.println("Campaign is added" + " " + game.getName() + " this game is have discount : " + campaign.getDiscount() );
		MultiplyLogger.MultiplyLog(campaign.getName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign is deleted.");
		MultiplyLogger.MultiplyLog(campaign.getName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign is updated.");
		MultiplyLogger.MultiplyLog(campaign.getName());
	}
	
}

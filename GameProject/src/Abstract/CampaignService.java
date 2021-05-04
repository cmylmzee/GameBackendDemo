package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
	void add(Campaign campaign, Game game);
	void delete(Campaign campaign);
	void update(Campaign campaign);
}

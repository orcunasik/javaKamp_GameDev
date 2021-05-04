package gameDev;

import java.time.LocalDate;

import Abstract.BaseManager;
import Adapters.MernisServiceManager;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Concrete.UserValidationManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Orçun");
		gamer.setLastName("Aþýk");
		gamer.setNationalIdentity("8656565");
		gamer.setBirthDate(LocalDate.of(1991, 1, 1));
		
		BaseManager gamerManager = new GamerManager(new MernisServiceManager());
		gamerManager.add(gamer);
		
		BaseManager gamerManager2 = new GamerManager(new UserValidationManager());
		gamerManager2.add(gamer);
		
		Game game = new Game(1,"Max Payne",15);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		Campaign campaign = new Campaign(1,"SummerRain",18);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.gameSale(game, gamer, campaign);
	}

}

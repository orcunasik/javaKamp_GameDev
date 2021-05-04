package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void gameSale(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncu " + 
					game.getName() + " isimli oyunu " + game.getPrice() + " pe�in fiyat�na sat�n ald�...");
		
	}

	@Override
	public void gameSale(Game game, Gamer gamer, Campaign campaign) {
		double discountAfterPrice = game.getPrice() - (game.getPrice() * campaign.getDiscount()/100);
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncu " + 
				game.getName() + " isimli oyunu " + discountAfterPrice + " indirimli fiyat�na sat�n ald�...");
		
	}

}

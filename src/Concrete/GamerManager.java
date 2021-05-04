package Concrete;

import Abstract.BaseManager;
import Abstract.UserValidationService;
import Entities.Gamer;

public class GamerManager extends BaseManager {

	private UserValidationService userValidationService;
	
	public GamerManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}
	
	@Override
	public void add(Gamer gamer){
		if(userValidationService.CheckIfRealGamer(gamer))
			super.add(gamer);
		else
			System.out.println("Gerçek Bir Kiþi Deðil!");
	}
	
}

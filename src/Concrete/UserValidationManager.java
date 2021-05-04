package Concrete;

import Abstract.UserValidationService;
import Entities.Gamer;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean CheckIfRealGamer(Gamer gamer) {
		return true;
	}

}

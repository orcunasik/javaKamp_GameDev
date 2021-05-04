package Adapters;

import java.rmi.RemoteException;

import Abstract.UserValidationService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceManager implements UserValidationService {

	@Override
	public boolean CheckIfRealGamer(Gamer gamer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalIdentity()),
					gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(),
					gamer.getBirthDate().getYear()
					);
		}catch (NumberFormatException exception) {
			exception.printStackTrace();
		}catch (RemoteException exception) {
			exception.printStackTrace();
		}
		
		return result;
	}

}

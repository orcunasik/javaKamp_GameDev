package Abstract;

import Entities.Gamer;

public abstract class BaseManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " isimli oyuncu Veritabanýna Kaydedildi");
	}

	@Override
	public final void update(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " ismli oyuncunun Veritabaný bilgileri güncellendi");
	}

	@Override
	public final void remove(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " isimli oyuncu Veritabanýndan Silindi");
		
	}


}

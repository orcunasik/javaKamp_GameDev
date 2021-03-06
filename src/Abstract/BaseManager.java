package Abstract;

import Entities.Gamer;

public abstract class BaseManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " isimli oyuncu Veritabanına Kaydedildi");
	}

	@Override
	public final void update(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " ismli oyuncunun Veritabanı bilgileri güncellendi");
	}

	@Override
	public final void remove(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " isimli oyuncu Veritabanından Silindi");
		
	}


}

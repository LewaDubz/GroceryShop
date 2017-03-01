package bolt.aruk;

import java.util.Date;
import java.text.SimpleDateFormat;

import bolt.Aru;

class Elelmiszer extends Aru {
	protected Date szavatossagiIdo;
	protected SimpleDateFormat sdf;
	
	public Elelmiszer(long vonalKod, String gyarto, Date szavatossagiIdo) {
		super(vonalKod,gyarto);
		this.szavatossagiIdo = szavatossagiIdo;
		this.sdf = new SimpleDateFormat("yyyy/MM/dd");
	}

	/**
	 * @return the vonalKod
	 */
	public long getVonalKod() {
		return vonalKod;
	}

	/**
	 * @return the gyarto
	 */
	public String getGyarto() {
		return gyarto;
	}

	/**
	 * @return the szavatossagiIdo
	 */
	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}
	public boolean joMeg() {
		return new Date().before(getSzavatossagiIdo());
	}

	
}

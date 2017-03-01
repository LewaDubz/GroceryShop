package bolt.aruk;

import java.util.Date;

public class Sajt extends Elelmiszer {
	protected double zsirtartalom;
	public Sajt(long vonalKod, String gyarto, Date szavatossagiIdo , double zsirtartalom) {
		super(vonalKod, gyarto, szavatossagiIdo);
		this.zsirtartalom = zsirtartalom;
		// TODO Auto-generated constructor stub
	}

}

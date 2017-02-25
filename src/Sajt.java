import java.sql.Date;

public abstract class Sajt extends Elelmiszer {
	private double suly;
	public Sajt(Long vonalKod,String gyarto,Date szavatossagiIdo,double zsirtartalom)
	{super(vonalKod,gyarto,szavatossagiIdo);
	this.suly = suly;
	this.zsirtartalom = zsirtartalom ;}

}

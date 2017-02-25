import java.sql.Date;

public class Elelmiszer {
	private Long vonalKod;
	private String gyarto;
	private Date szavatossagiIdo;
	
	protected Elelmiszer(Long vonalKod ,String gyarto ,Date szavatossagiIdo)
	{
		this.vonalKod = vonalKod ;
		this.gyarto = gyarto  ;
		this.szavatossagiIdo = szavatossagiIdo ;
	}
	private Long getVonalKod()
	{
		return vonalKod;
	}
	private boolean joMeg()
	{
		return true;
	}
	private String getGyarto()
	{
		return gyarto;
	}
	private Date getSzavatossagiIdo()
	{
		return szavatossagiIdo;
	}
	/*private String toString()
	{
		return this.toString();*/
	}


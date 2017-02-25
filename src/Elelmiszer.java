import java.sql.Date;
import java.text.SimpleDateFormat;

public abstract class Elelmiszer extends Aru{
	protected SimpleDateFormat sdf;
	protected Date szavatossagiIdo;
	protected double zsirtartalom;
	
	protected Elelmiszer(Long vonalKod ,String gyarto ,Date szavatossagiIdo)
	{
		super(vonalKod,gyarto);
		this.szavatossagiIdo = szavatossagiIdo;
		this.sdf = new SimpleDateFormat("yyyy/MM/dd");

	}
	public Long getVonalKod()
	{
		return vonalKod;
	}
	public abstract boolean joMeg();
	
	public String getGyarto()
	{
		return gyarto;
	}
	public abstract Date getSzavatossagiIdo();
	
	/*private String toString()
	{
		return this.toString();*/
	}


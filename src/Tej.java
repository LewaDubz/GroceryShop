import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public abstract class Tej extends Elelmiszer {
private long vonalKod;
private int urtartalom;
private String gyarto;
private Date szavatossagiIdo;
private double zsirtartalom;
private long ar;

	public Tej(long vonalKod, int urtartalom , String gyarto , Date szavatossagiIdo , double zsirtartalom)
	{
		super(vonalKod,gyarto,szavatossagiIdo);
		this.urtartalom = urtartalom;
		///this.gyarto = gyarto;
		//this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
	}
	public Long getVonalKod()
	{
		return vonalKod;
	}
	public boolean joMeg(){
		//if (LocalDateTime.now().compareTo(szavatossagiIdo)<0)
		//	{return true;}
	return false;
	}
	
	private int getUrtartalom(){
		return urtartalom;
	}
	
	public String getGyarto(){
		return gyarto;
	}
	private long getAr()
	{	return ar;
	}
	/*private String toString()
	{	return this.toString();
	}*/
	
	
	
}
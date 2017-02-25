import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public abstract class Tej {
private long vonalKod;
private int urtartalom;
private String gyarto;
private Date szavatossagiIdo;
private double zsirtartalom;
private long ar;

	public Tej(long vonalKod, int urtartalom , String gyarto , Date szavatossagiIdo , double zsirtartalom , long ar)
	{
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
	}
	private long getVonalKod()
	{
		return this.vonalKod;
	}
	private boolean joMeg(){
		//if (LocalDateTime.now().compareTo(szavatossagiIdo)<0)
		//	{return true;}
	return false;
	}
	
	private int getUrtartalom(){
		return this.urtartalom;
	}
	
	private String getGyarto(){
		return this.gyarto;
	}
	private long getAr()
	{	return this.ar;
	}
	private String toString()
	{	return this.toString();
	}
}
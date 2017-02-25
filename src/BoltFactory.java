import java.sql.Date;

public class BoltFactory {

public Tej ujTartosTej(Long vonalKod,int urtartalom,String gyarto,Date szavatossagiIdo,double zsirtartalom)
{
	Tej tej = new TartosTej(vonalKod,urtartalom,gyarto,szavatossagiIdo,zsirtartalom);
}
}

import java.sql.Date;
import bolt.aruk.Sajt;
import bolt.aruk.Szappan;
import bolt.aruk.Tej;
import bolt.aruk.tej.FeltartosTej;
import bolt.aruk.tej.TartosTej;

public class BoltFactory {

public Tej ujTartosTej(Long vonalKod,int urtartalom,String gyarto,Date szavatossagiIdo,double zsirtartalom)
{
	return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
}
}

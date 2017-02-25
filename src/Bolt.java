
public class Bolt {
	private String nev;
	private String cim;
	private String tulajdonos;
	private Tej[] tejpult;
	private int flag;
	
	public Bolt(String nev,String cim,String tulajdonos,Tej[] tejpult)
	{	this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.tejpult = tejpult;
	}
	public Bolt(String nev,String cim,String tulajdonos)
	{	this.nev = nev;
		this.cim = cim;
	}
	private String getNev()
	{
		return this.nev;
	}
	private String getCim()
	{
		return this.cim;
	}
	private String getTulajdonos()
	{
		return this.tulajdonos;
	}
	private boolean vanMegTej()
	{
		return true;
	}
	private void TejvasarolTej()
	{
	}
	private void feltoltTej()
	{
	}
}

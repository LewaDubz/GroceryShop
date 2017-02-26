import java.util.Hashtable;

public class Bolt {
	private String nev;
	private String cim;
	private String tulajdonos;
	private Tej[] tejpult;
	private int flag;
	private Hashtable<Long,BoltBejegyzes> elelmiszerpult = new Hashtable<Long,BoltBejegyzes>();
	
	public Bolt(String nev,String cim,String tulajdonos,Hashtable elelmiszerpult)
	{	this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.elelmiszerpult = elelmiszerpult;
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
	private boolean vanMegTej() {
		for (Long key : elelmiszerpult.keySet()) {
			if (Tej.class.isAssignableFrom(elelmiszerpult.get(key).getAru().getClass())) {
				return (elelmiszerpult.get(key).getMennyiseg()) > 0;
			}
		}
		return false;
	}
	private boolean vanMegSajt()
	{
		return true;
	}
	private void TejvasarolTej()
	{
	}
	private void feltoltTej()
	{
	}
	public class BoltBejegyzes {
		private Tej t;
		private int mennyiseg;
		private int ar;
		
		public BoltBejegyzes(Tej t,int mennyiseg ,int ar)
		{this.t = t;
		this.ar = ar;
		this.mennyiseg = mennyiseg;
		}
		private Tej getT()
		{
			return t;
		}
		private void setT(Tej t)
		{
			this.t = t;
		}
		private int getMennyiseg()
		{
		return mennyiseg;
		}
		private void setMennyiseg(int mennyiseg)
		{
			this.mennyiseg = mennyiseg;
		}
		private void adMennyiseg(int mennyiseg)
		{
			this.mennyiseg += mennyiseg;
		}
		private void levonMennyiseg(int mennyiseg)
		{
			this.mennyiseg -= mennyiseg;
		}
		private int getAr()
		{
			return ar;
		}
		private Aru getAru() {
			return a;
		}
		private void setAr(int ar)
		{
			this.ar =ar;
		}
	}

}

import bolt.aruk.*;
import bolt.*;

public class Bolt {
	protected String nev;
	protected String cim;
	protected String tulajdonos;
	protected Tej[] tejpult;
	protected int flag;
	
	public Bolt(String nev, String cim, String tulajdonos, Tej[] tejpult) {
		super();
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.tejpult = tejpult;
	}

	public Bolt(String nev, String cim, String tulajdonos) {
		super();
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}

	/**
	 * @return the nev
	 */
	public String getNev() {
		return nev;
	}

	/**
	 * @return the cim
	 */
	public String getCim() {
		return cim;
	}

	/**
	 * @return the tulajdonos
	 */
	public String getTulajdonos() {
		return tulajdonos;
	}
	private boolean vanMegadottAru(Object obj){
		return false;
	}
	private void vanMegtej(){}
	private void vasaroltej(Tej m){}
	private void feltoltTej(Tej m){}
	
public class BoltBejegyzes{
	private Aru a;
	private long mennyiseg;
	private long ar;
	/**
	 * @return the a
	 */
	public Aru getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(Aru a) {
		this.a = a;
	}
	/**
	 * @return the mennyiseg
	 */
	public long getMennyiseg() {
		return mennyiseg;
	}
	/**
	 * @param mennyiseg the mennyiseg to set
	 */
	public void setMennyiseg(long mennyiseg) {
		this.mennyiseg = mennyiseg;
	}
	public void levonMennyiseg(long mennyiseg){
		this.mennyiseg -= mennyiseg;
	}
	public void adMennyiseg(long mennyiseg){
		this.mennyiseg += mennyiseg;
	}
	/**
	 *
	 * @return the ar
	 */
	public long getAr() {
		return ar;
	}
	/**
	 * @param ar the ar to set
	 */
	public void setAr(long ar) {
		this.ar = ar;
	}
	
	
	}

	

}


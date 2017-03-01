package bolt.aruk;

import java.util.Date;

public abstract class Tej extends Elelmiszer {
	/*private final int LITER;
	private final int FELLITER;
	private final int POHAR;
	private final double ZSIROS;
	private final double FELZSIROS;
	private long vonalkod;*/
	protected int urtartalom;
	protected String gyarto;
	protected Date szavatossagiIdo;
	protected double Zsirtartalom;
	protected long ar;
	
	

	public Tej(long vonalKod,int urtartalom, String gyarto, Date szavatossagiIdo,double Zsirtartalom) {
		super(vonalKod, gyarto, szavatossagiIdo);
		this.Zsirtartalom  = Zsirtartalom;
		this.urtartalom = urtartalom;
		}

	/**
	 * @return the urtartalom
	 */
	public int getUrtartalom() {
		return urtartalom;
	}

	/**
	 * @return the vonalkod
	 */
	public long getVonalkod() {
		return vonalKod;
	}

	/**
	 * @return the gyarto
	 */
	public String getGyarto() {
		return gyarto;
	}

	/**
	 * @return the szavatossagiIdo
	 */
	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	/**
	 * @return the zsirtartalom
	 */
	public double getZsirtartalom() {
		return Zsirtartalom;
	}

	/**
	 * @return the ar
	 */
	public long getAr() {
		return ar;
	}
	public boolean joMeg() {
		return new Date().before(getSzavatossagiIdo());

	/*public String toString() {
		return String.format("Gyártó: %s%nŰrtartalom: %d%nZsírtartalom: %.2f%nSzavatossagi idő: %s%nVonalKód: %d",
				getGyarto(), getUrtartalom(), getZsirtartalom(), sdf.format(getSzavatossagiIdo()), getVonalKod());
	}*/
}}


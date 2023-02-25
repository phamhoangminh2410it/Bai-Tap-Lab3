class HinhVuong
{
	private double kt, cv, dt;

	public void setHV(double kt)
	{
		this.kt = kt;
	}
	public void tinhCV()
	{
		cv = kt*4;
	}
	public void tinhDT()
	{
		dt = kt*kt;
	}
	public double getCV()
	{
		return cv;
	}
	public double getDT()
	{
		return dt;
	}
}

class HinhTron
{
	private final double PI = 3.14;
	private double bk, cv, dt;

	public void setHT(double bk)
	{
		this.bk = bk;
	}
	public void tinhCV()
	{
		cv = 2*PI*bk;
	}
	public void tinhDT()
	{
		dt = PI*bk*bk;
	}
	public double getCV()
	{
		return cv;
	}
	public double getDT()
	{
		return dt;
	}
}

public class Bai1
{
	public static void main(String[] args)
	{
		HinhVuong kqhv = new HinhVuong();
		kqhv.setHV(6);
		kqhv.tinhCV();
		System.out.println(kqhv.getCV());
		HinhTron kqht = new HinhTron();
		kqht.setHT(5);
		kqht.tinhCV();
		System.out.println(kqht.getCV());
	}
}
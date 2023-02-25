class NhanVien
{
	private String tenNhanVien;
	private double luongCoBan;
	private double heSoLuong;
	private double luongMax;
	private double luong;

	public void setNhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double luongMax)
	{
		this.tenNhanVien = tenNhanVien;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.luongMax = luongMax;
	}
	public void tinhLuong()
	{
		luong = luongCoBan*heSoLuong;
	}
	public void inTTin()
	{
		System.out.println(tenNhanVien);
		System.out.println(luongCoBan);
		System.out.println(heSoLuong);
		System.out.println(luongMax);
	}
	public boolean gettangLuong(double n)
	{
		heSoLuong = n;
		tinhLuong();
		if (luong > luongMax)
		{
			System.out.println("Sorry!");
			return false;
		}
		else
		{
			return true;
		}
	}
}

public class Bai3
{
	public static void main(String[] args)
	{
		NhanVien kq = new NhanVien();
		kq.setNhanVien("Minh", 1, 2, 3);
		kq.gettangLuong(5);
		kq.inTTin();
	}
}
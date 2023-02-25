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
	public double getTinhLuong()
	{
		return luong;
	}
	public void inTTin()
	{
		System.out.println(tenNhanVien);
		System.out.println(luongCoBan);
		System.out.println(heSoLuong);
		System.out.println(luongMax);
		System.out.println(luong);
	}
	public double tangLuong(double n)
	{
		for (; heSoLuong<=n; heSoLuong++)
		{
			if (heSoLuong > luongMax)
			{
				break;
				return boolean test = false;
			}
		}
	}
}

public class Bai3
{
	public static void main(String[] args)
	{
		NhanVien kq = new NhanVien();
		kq.setNhanVien("Minh", 1, 2, 3);
		kq.tangLuong(5);
		kq.tinhLuong();
		System.out.println(kq.getTinhLuong());
		System.out.println("\n");
		kq.inTTin();
	}
}
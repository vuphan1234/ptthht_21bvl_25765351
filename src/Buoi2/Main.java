package Buoi2;

public class Main {
	public static void main(String[] args) {
		SanPham sp1 = new SanPham("SP01", "BAN PHIM", 350000, 2);
		sp1.hienThiThongTin();
		
		System.out.println(sp1.getTenSP());
	}
}

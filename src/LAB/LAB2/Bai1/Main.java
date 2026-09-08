package LAB.LAB2.Bai1;

public class Main {
	public static void main(String[] args) {
		SanPham sp1 = new SanPham("1", "DIEN THOAI", 19.99, 10);
		SanPham sp2 = new SanPham("2", "Laptop", 30.99, 20);
		
		sp1.setSoLuong(2);
		sp2.setSoLuong(1);
		
		sp1.hienThiThongTin();
		sp1.nhapHang(1);
		sp1.hienThiThongTin();
		
		sp2.hienThiThongTin();
		sp2.banHang(5);
		sp2.hienThiThongTin();
//		
//		
//		sp2.hienThiThongTin();
//		sp2.banHang(15);
//		sp2.hienThiThongTin();
		
		
	}
}

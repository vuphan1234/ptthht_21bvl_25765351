package Buoi2;


// class là bản thiết kế, object là 
public class SanPham {
	private String maSP;
	private String tenSP;
	private double donGia;
	private int soLuong;
	
	public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	
	public String getMaSP() {
		return this.maSP;
	}
	
	public String getTenSP() {
		return this.tenSP;
	}
	
	public double getDonGia() {
		return this.donGia;
	}
	
	public int getSoLuong() {
		return this.soLuong;
	}
	
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public double tinhThanhTien() {
		return this.donGia * this.soLuong;
	}
	
	public void hienThiThongTin() {
		System.out.printf("MaSP = %s, TenSP = %s, DonGia = %.2f, SoLuong = %d\n"
				, this.maSP, this.tenSP, this.donGia, this.soLuong);
		System.out.printf("Thanh tien = %.2f\n", tinhThanhTien());
	}
	
}

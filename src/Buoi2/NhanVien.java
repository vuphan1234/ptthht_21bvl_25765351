package Buoi2;

abstract class NhanVien {
	private String hoTen;
	private String cccd;
	
	public NhanVien(String hoTen, String cccd) {
		this.hoTen = hoTen;
		this.cccd = cccd;
	}
	
	public abstract double tinhLuong();
}

class NhanVienToanThoiGian extends NhanVien {
	private double luongCoBan;
	private double heSoLuong;
	
	public NhanVienToanThoiGian(String hoTen, String cccd, double luongCoBan, double heSoLuong) {
		super(hoTen, cccd);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
	}
	
	@Override
	public double tinhLuong() {
		return this.luongCoBan * this.heSoLuong;
	}
}

class NhanVienBanThoiGian extends NhanVien {
	private double luongNgay;
	private int soNgay;
	
	public NhanVienBanThoiGian(String hoTen, String cccd, double luongNgay, int soNgay) {
		super(hoTen, cccd);
		this.luongNgay = luongNgay;
		this.soNgay = soNgay;
	}
	
	@Override
	public double tinhLuong() {
		return this.luongNgay * this.soNgay;
	}
}

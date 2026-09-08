package LAB.LAB2.Bai1;

public class SanPham {
	private String maSP;
	private String tenSP;
	private double donGia;
	private int soLuongTonKho;
	private int soLuong;

	public SanPham(String maSP, String tenSP, double donGia, int soLuongTonKho) {
		this.setMaSP(maSP);
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.soLuongTonKho = soLuongTonKho;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public double getDonGia() {
		return this.donGia;
	}

	public int getSoLuongTonKho() {
		return this.soLuongTonKho;
	}
	
	public int getSoLuong() {
		return this.soLuong;
	}
	
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public void nhapHang(int soLuongNhap) {
		if (soLuongNhap > 0) {
			this.soLuongTonKho += soLuongNhap;
		} else {
			throw new IllegalArgumentException("So luong nhap khong duoc nho hon 0!");
		}
	}

	public boolean banHang(int soLuongBan) {
		if (soLuongBan > 0 && soLuongBan <= this.soLuongTonKho) {
			this.soLuongTonKho -= soLuongBan;
			return true;
		} else if (soLuongBan > this.soLuongTonKho) {
			System.out.println("So luong ton kho khong du!");
			return false;
		}
		return false;
	}

	public double tinhThanhTien() {
		return this.donGia * soLuong;
	}

	public void hienThiThongTin() {
		System.out.printf("MaSP: %s," + "TenSP: %s" + "DonGia: %.2f" + "SoLuong: %d" + "ThanhTien: %.2f\n", this.maSP,
				this.tenSP, this.donGia, this.soLuong, this.tinhThanhTien());
	}

}

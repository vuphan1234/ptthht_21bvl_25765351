package LAB.LAB2.Bai2;

class SinhVien extends Nguoi {
	private String maSinhVien;
	private String nganhHoc;
	private double diemTrungBinh;
	
	public SinhVien(String hoTen, int namSinh, String diaChi, String maSinhVien, String nganhHoc, double diemTrungBinh) {
		super(hoTen, namSinh, diaChi);
		this.setMaSinhVien(maSinhVien);
		this.setNganhHoc(nganhHoc);
		this.setDiemTrungBinh(diemTrungBinh);
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getNganhHoc() {
		return nganhHoc;
	}

	public void setNganhHoc(String nganhHoc) {
		this.nganhHoc = nganhHoc;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.printf(
				"MaSinhVien: %s, "
				+ "NganhHoc: %s, "
				+ "DiemTrungBinh: %.2f\n",
				this.maSinhVien,
				this.nganhHoc,
				this.diemTrungBinh
				);
	}
	
	public String xepLoai() {
		if (this.diemTrungBinh >= 8.5) {
			return "GIOI";
		} else if (this.diemTrungBinh >= 7.0) {
			return "KHA";
		} else if (this.diemTrungBinh >= 5.0) {
			return "TRUNG BINH";
		}
		return "YEU";
	}
}
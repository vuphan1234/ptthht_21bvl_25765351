package LAB.LAB2.Bai2;

class GiangVien extends Nguoi{
	private String maGiangVien;
	private String chuyenMon;
	private double luongCoBan;
	private double heSoLuong;
	
	public GiangVien(String hoTen, int namSinh, String diaChi, String maGiangVien, 
			String chuyenMon, double luongCoBan, double heSoLuong) {
		super(hoTen, namSinh, diaChi);
		this.maGiangVien = maGiangVien;
		this.chuyenMon = chuyenMon;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
	}
	
	public double tinhLuong() {
		return luongCoBan * heSoLuong;
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.printf(
				"MaGiangVien: %s, "
				+ "ChuyenMon: %s, "
				+ "LuongCoBan: %.2f, "
				+ "HeSoLuong: %.2f, "
				+ "TienLuong: %.2f\n",
				maGiangVien,
				chuyenMon,
				luongCoBan,
				heSoLuong,
				tinhLuong()
				);
	}
	
	public String getMaGiangVien() {
		return this.maGiangVien;
	}
	
	public void setMaGiangVien(String maGiangVien) {
		this.maGiangVien = maGiangVien;
	}
	
	public String getChuyenMon() {
		return this.chuyenMon;
	}
	
	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}
	
	public double getLuongCoBan() {
		return this.luongCoBan;
	}
	
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	
	public double getHeSoLuong() {
		return this.heSoLuong;
	}
	
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	
}

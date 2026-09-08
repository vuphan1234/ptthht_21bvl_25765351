package LAB.LAB2.Bai2;

import java.time.LocalDate;

public class Nguoi {
	private String hoTen;
	private int namSinh;
	private String diaChi;
	
	public Nguoi(String hoTen, int namSinh, String diaChi) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diaChi = diaChi;
	}
	
	public String getHoten() {
		return this.hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public int getNamSinh() {
		return this.namSinh;
	}
	
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public String getDiaChi() {
		return this.diaChi;
	}
	
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public int tinhTuoi() {
		return LocalDate.now().getYear() - this.namSinh;
	}
	
	public void hienThiThongTin() {
		System.out.printf(
				"HoTen: %s "
				+ "NamSinh: %d "
				+ "Tuoi: %d "
				+ "DiaChi: %s\n",
				this.hoTen,
				this.namSinh,
				this.tinhTuoi(),
				this.diaChi
				);
	}
}



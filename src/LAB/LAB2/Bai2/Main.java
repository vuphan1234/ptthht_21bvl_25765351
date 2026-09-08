package LAB.LAB2.Bai2;

public class Main {
	public static void main(String[] args) {
		Nguoi nguoi = new Nguoi("van A", 2000, "hcm");
		SinhVien sv1 = new SinhVien("van b", 2001, "ha noi", "PS1234", "IT", 8.8);
		GiangVien gv1 = new GiangVien("van c", 1990, "nghe an", "ps5678", "CNTT", 3000.00, 2.1);
		
		nguoi.hienThiThongTin();
		sv1.hienThiThongTin();
		System.out.println(sv1.xepLoai());
		gv1.hienThiThongTin();
		
		
	}
}	

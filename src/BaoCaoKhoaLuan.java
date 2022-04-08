import java.text.ParseException;

public class BaoCaoKhoaLuan extends BaoCao {
    private String danhGiaGiangVien;
    private String dsTvHoiDong;
    private double diemKhoaLuan;
    private String nhanXet;
    private double diemTongKet;

    public BaoCaoKhoaLuan() {

    }

    public BaoCaoKhoaLuan(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diem, String danhGiaGiangVien, String dsTvHoiDong, double diemKhoaLuan, String nhanXet, double diemTongKet) throws ParseException {
        super(maBaoCao, tenBaoCao, linkBaoCao, ngayBaoCao, dsSinhVien, tenGiangVien, diem);
        this.danhGiaGiangVien = danhGiaGiangVien;
        this.dsTvHoiDong = dsTvHoiDong;
        this.diemKhoaLuan = diemKhoaLuan;
        this.nhanXet = nhanXet;
        this.diemTongKet = diemTongKet;
    }

    @Override
    public void nhap() throws ParseException {
        super.nhap();
        System.out.print("Nhap danh gia giang vien: ");
        this.danhGiaGiangVien = s.nextLine();
        System.out.print("Nhap danh sach thanh vien hoi dong: ");
        this.dsTvHoiDong = s.nextLine();
        System.out.print("Nhap diem khoa luan: ");
        this.diemKhoaLuan = Double.parseDouble(s.nextLine());
        System.out.print("Nhap nhan xet: ");
        this.nhanXet = s.nextLine();
        System.out.print("Nhap diem tong ket: ");
        this.diemTongKet = Double.parseDouble(s.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("Danh gia giang vien: %s\nDanh sach thanh vien hoi dong: %s\nDiem khoa luan: %.1f\nNhan xet: %s\nDiem tong ket: %.1f\n", this.danhGiaGiangVien, this.dsTvHoiDong, this.diemKhoaLuan, this.nhanXet, this.diemTongKet);
    }

    public String getDanhGiaGiangVien() {
        return danhGiaGiangVien;
    }

    public void setDanhGiaGiangVien(String danhGiaGiangVien) {
        this.danhGiaGiangVien = danhGiaGiangVien;
    }

    public String getDsTvHoiDong() {
        return dsTvHoiDong;
    }

    public void setDsTvHoiDong(String dsTvHoiDong) {
        this.dsTvHoiDong = dsTvHoiDong;
    }
}

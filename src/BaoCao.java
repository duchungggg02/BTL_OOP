import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BaoCao {
    private String maBaoCao;
    private String tenBaoCao;
    private String linkBaoCao;
    private Date ngayBaoCao;
    private String dsSinhVien;
    private String tenGiangVien;
    private double diem;

    public static Scanner s = new Scanner(System.in);
    public static SimpleDateFormat F = new SimpleDateFormat("yyyy-MM-dd");

    public BaoCao() {

    }

    public BaoCao(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diem) throws ParseException {
        this.maBaoCao = maBaoCao;
        this.tenBaoCao = tenBaoCao;
        this.linkBaoCao = linkBaoCao;
        this.ngayBaoCao = F.parse(ngayBaoCao);
        this.dsSinhVien = dsSinhVien;
        this.tenGiangVien = tenGiangVien;
        this.diem = diem;
    }

    public void nhap() throws ParseException {
        System.out.print("Nhap ma bao cao: ");
        this.maBaoCao = s.nextLine();
        System.out.print("Nhap ten bao cao: ");
        this.tenBaoCao = s.nextLine();
        System.out.print("Nhap link bao cao: ");
        this.linkBaoCao = s.nextLine();
        System.out.print("Nhap ngay bao cao: ");
        this.ngayBaoCao = F.parse(s.nextLine());
        System.out.print("Nhap danh sach sinh vien thuc hien: ");
        this.dsSinhVien = s.nextLine();
        System.out.print("Nhap ten giang vien: ");
        this.tenGiangVien = s.nextLine();
        System.out.print("Nhap diem bao cao: ");
        this.diem = Double.parseDouble(s.nextLine());
    }

    public void xuat() {
        System.out.printf("== == == == ==\nMa bao cao: %s\nTen bao cao: %s\nLink bao cao: %s\nNgay bao cao: %s\nDanh sach sinh vien: %s\nTen giang vien: %s\nDiem: %.1f\n", this.maBaoCao, this.tenBaoCao, this.linkBaoCao, this.ngayBaoCao, this.dsSinhVien, this.tenGiangVien, this.diem);
    }

    public String getMaBaoCao() {
        return maBaoCao;
    }

    public void setMaBaoCao(String maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    public String getTenBaoCao() {
        return tenBaoCao;
    }

    public void setTenBaoCao(String tenBaoCao) {
        this.tenBaoCao = tenBaoCao;
    }

    public String getLinkBaoCao() {
        return linkBaoCao;
    }

    public void setLinkBaoCao(String linkBaoCao) {
        this.linkBaoCao = linkBaoCao;
    }

    public Date getNgayBaoCao() {
        return ngayBaoCao;
    }

    public void setNgayBaoCao(Date ngayBaoCao) {
        this.ngayBaoCao = ngayBaoCao;
    }

    public String getDsSinhVien() {
        return dsSinhVien;
    }

    public void setDsSinhVien(String dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}

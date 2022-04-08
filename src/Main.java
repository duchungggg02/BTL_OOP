import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        QuanLyBaoCao ds = new QuanLyBaoCao();
        BaoCao b1 = new BaoCaoThucTap();
        BaoCao b2 = new BaoCaoDoAn();
        BaoCao b3 = new BaoCaoKhoaLuan();
        b1.nhap();
        b2.nhap();
        b3.nhap();
        ds.themBaoCao(b1);
        ds.themBaoCao(b2);
        ds.themBaoCao(b3);
        ds.hienThi();
        ds.xoaBaoCao();
        ds.hienThi();
    }
}

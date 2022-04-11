import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        QuanLyBaoCao ds = new QuanLyBaoCao();
        BaoCao b1 = new BaoCaoThucTap("TT01","Đồ Án 00","a.com","2022-04-25","a,b","Duong Huu Thanh",8.5,"abcdef");
        BaoCao b2 = new BaoCaoDoAn("DA01","Đồ Án 02","b.com","2022-04-05","a,b","Duong Huu Thanh",8.5,20);
        BaoCao b3 = new BaoCaoKhoaLuan("KL01","Cồ Án 00","c.com","2022-04-11","a,b","Duong Huu Thanh",8.5,"abcd","a,b,c",7,"abc",6);
        ds.themBaoCao(b1);
        ds.themBaoCao(b2);
        ds.themBaoCao(b3);
//        ds.hienThi();
        ds.sortByDate();
//        ds.xoaBaoCao();
        ds.hienThi();
    }
}

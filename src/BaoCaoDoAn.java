import java.text.ParseException;
import java.util.Date;

public class BaoCaoDoAn extends BaoCao {
    private double tyLeDaoVan;

    public BaoCaoDoAn() {

    }

    public BaoCaoDoAn(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diem, double tyLeDaoVan) throws ParseException {
        super(maBaoCao, tenBaoCao, linkBaoCao, ngayBaoCao, dsSinhVien, tenGiangVien, diem);
        this.tyLeDaoVan = tyLeDaoVan;
    }

    @Override
    public void nhap() throws ParseException {
        super.nhap();
        System.out.print("Nhap ty le dao van: ");
        this.tyLeDaoVan = Double.parseDouble(s.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("Ty le dao van: %.1f\n", this.tyLeDaoVan);
    }

    public double getTyLeDaoVan() {
        return tyLeDaoVan;
    }

    public void setTyLeDaoVan(double tyLeDaoVan) {
        this.tyLeDaoVan = tyLeDaoVan;
    }
}

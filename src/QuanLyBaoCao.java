import java.util.ArrayList;
import java.util.List;

public class QuanLyBaoCao {
    private List<BaoCao> ds = new ArrayList<>();

    public void themBaoCao(BaoCao b) {
        this.getDs().add(b);
    }

    public void hienThi() {
        this.getDs().forEach(b -> b.xuat());
    }

    public void xoaBaoCao() {
        System.out.print("Nhap ma bao cao muon xoa: ");
        String str = BaoCao.s.nextLine();
        for (BaoCao b: this.getDs())
            if (str.equals(b.getMaBaoCao())) {
                this.getDs().remove(b);
                System.out.println("Xoa thanh cong");
                break;
            }
            else System.out.println("Xoa khong thanh cong");
    }

    public List<BaoCao> getDs() {
        return ds;
    }

    public void setDs(List<BaoCao> ds) {
        this.ds = ds;
    }
}

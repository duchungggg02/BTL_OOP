import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public void sortByName() {
        Collections.sort(ds, new Comparator<BaoCao>() {
            @Override
            public int compare(BaoCao o1, BaoCao o2) {
                String name1 = o1.getTenBaoCao();
                String name2 = o2.getTenBaoCao();
                String n1 = name1.substring(name1.lastIndexOf(" ") + 1);
                String n2 = name2.substring(name2.lastIndexOf(" ") + 1);
                int compareName = n1.compareTo(n2);
                if(compareName == 0) {
                    String l1 = name1.substring(0, name1.indexOf(" "));
                    String l2 = name2.substring(0, name2.indexOf(" "));
                    return l1.compareTo(l2);
                } else {
                    return compareName;
                }
            }
        });
    }

    public void sortByDate() {
        Collections.sort(ds, new Comparator<BaoCao>() {
            @Override
            public int compare(BaoCao o1, BaoCao o2) {
                return o1.getNgayBaoCao().compareTo(o2.getNgayBaoCao());
            }
        });
    }

    public List<BaoCao> getDs() {
        return ds;
    }

    public void setDs(List<BaoCao> ds) {
        this.ds = ds;
    }
}

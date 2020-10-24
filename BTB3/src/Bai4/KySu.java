package Bai4;

//Nguyễn Khắc Tài - CT030147

public class KySu extends CanBo {
    protected String nganhDaoTao;

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu(String hoTen, int namSinh, String diaChi, String nganhDaoTao) {
        super(hoTen, namSinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }
}

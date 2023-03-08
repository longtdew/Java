package entity;

import java.util.Collection;
import java.util.List;

public class KhachHang {
    private String maKH;
    private String hoTen;
    private String diaChi;
    private String soDT;
    private String loaiKH;
    private List<TaiKhoan> danhSachTaiKhoan;

    public KhachHang() {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.loaiKH = loaiKH;
        this.maKH = String.valueOf(generateMaKH());

    }

    public KhachHang(String maKH, String hoTen, String diaChi, String soDienThoai) {

    }

    public String getMaKH() {
        return maKH;
    }

    public List<TaiKhoan> getDanhSachTaiKhoan() {
        return danhSachTaiKhoan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    private int generateMaKH() {
        return 0;
    }
    public double tinhTongSoTienGui() {
        double tong = 0;
        for (TaiKhoan tk : danhSachTaiKhoan) {
            tong += tk.getSoTien();
        }
        return tong;
    }

    public Collection<? extends SoTietKiem> getDanhSachSoTietKiem() {
        return null;
    }
}

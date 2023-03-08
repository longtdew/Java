package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SoTietKiem {
    private static KhachHang[] danhSachKhachHang;
    private KhachHang khachHang;
    private NganHang nganHang;
    private double soTienGui;

    public SoTietKiem(Object khachHang, NganHang nganHang, double soTienGui, LocalDate ngayMoSo, LocalDate ngayDenHan, double laiSuat) {

    }

    public SoTietKiem(Object khachHang, NganHang nganHang, double soTienGui) {

    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NganHang getNganHang() {
        return nganHang;
    }

    public void setNganHang(NganHang nganHang) {
        this.nganHang = nganHang;
    }

    public double getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(double soTienGui) {
        this.soTienGui = soTienGui;
    }
    public static List<SoTietKiem> danhSachSoTietKiem() {
        List<SoTietKiem> danhSach = new ArrayList<>();

        for (KhachHang kh : danhSachKhachHang) {
            danhSach.addAll(kh.getDanhSachSoTietKiem());
        }

        return danhSach;
    }
    public double tinhLaiSuat() {
        double laiSuat = nganHang.getLaiSuat();
        double soTienLai = soTienGui * laiSuat / 100;
        return soTienLai;
    }
    @Override
    public String toString() {
        return "So tiet kiem cua khach hang " + khachHang.getHoTen() + " tai ngan hang " + nganHang.getTenNH() +
                ", co so tien gui la " + soTienGui + " VND, lai suat la " + nganHang.getLaiSuat() + "%";
    }
}


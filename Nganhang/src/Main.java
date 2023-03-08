import entity.KhachHang;
import entity.NganHang;
import entity.SoTietKiem;
import entity.TaiKhoan;

import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static entity.SoTietKiem.danhSachSoTietKiem;

public class Main {
    private static ArrayList<KhachHang> danhSachKhachHang = new ArrayList<>();
    private static ArrayList<NganHang> danhSachNganHang = new ArrayList<>();
    private static ArrayList<SoTietKiem> danhSachSoTietKiem = new ArrayList<>();
    private static Object KhachHang;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Nhap danh sach khach hang");
        System.out.println("2. In danh sach khach hang");
        System.out.println("3. Nhap danh sach ngan hang");
        System.out.println("4. In danh sach ngan hang");
        System.out.println("5. Nhap danh sach so tiet kiem");
        System.out.println("6. In danh sach so tiet kiem");
        System.out.println("7. Sap xep theo ho ten");
        System.out.println("8. Sap xep theo so tien gui");
        System.out.println("9. Tinh tong so tien gui cua moi khach hang");
        System.out.println("10. Luu du lieu vao file");
        System.out.println("11. Thoat chuong trinh");

        int choice;
        do {
            System.out.print("Nhap lua chon cua ban (1-11): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    nhapDanhSachKhachHang();
                    break;
                case 2:
                    inDanhSachKhachHang();
                    break;
                case 3:
                    nhapDanhSachNganHang();
                    break;
                case 4:
                    inDanhSachNganHang();
                    break;
                case 5:
                    nhapDanhSachSoTietKiem();
                    break;
                case 6:
                    inDanhSachSoTietKiem();
                    break;
                case 7:
                    sapXepTheoHoTen();
                    break;
                case 8:
                    sapXepTheoSoTienGui();
                    break;
                case 9:
                    tinhTongSoTienGui();
                    break;
                case 10:
                    luuDuLieuVaoFile();
                    break;
                case 11:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
                    break;
            }
        } while (choice != 11);
    }

    private static void nhapDanhSachKhachHang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong khach hang: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho khach hang thu " + (i + 1));
            System.out.print("Nhap ma khach hang: ");
            String maKH = scanner.nextLine();
            System.out.print("Nhap ho ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Nhap dia chi: ");
            String diaChi = scanner.nextLine();
            System.out.print("Nhap so dien thoai: ");
            String soDienThoai = scanner.nextLine();
            KhachHang khachHang = new KhachHang(maKH, hoTen, diaChi, soDienThoai);
            danhSachKhachHang.add(khachHang);
        }
    }

    private static void inDanhSachKhachHang() {
        System.out.println("Danh sach khach hang:");
        for (KhachHang kh : danhSachKhachHang) {
            System.out.println("Ho ten: " + kh.getHoTen());
            System.out.println("Dia chi: " + kh.getDiaChi());
            System.out.println("So dien thoai: " + kh.getSoDT());
            System.out.println("Loai khach hang: " + kh.getLoaiKH());
            System.out.println("Danh sach tai khoan:");
        }
    }

    private static void nhapDanhSachNganHang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong ngan hang: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho ngan hang thu " + (i + 1));
            System.out.print("Nhap ma ngan hang: ");
            String maNganHang = scanner.nextLine();
            System.out.print("Nhap ten ngan hang: ");
            String tenNganHang = scanner.nextLine();
            System.out.print("Nhap lai suat: ");
            double laiSuat = scanner.nextDouble();
            scanner.nextLine();
            NganHang nganHang = new NganHang(maNganHang, tenNganHang, laiSuat);
            danhSachNganHang.add(nganHang);
        }
    }

    private static void inDanhSachNganHang() {
        System.out.println("Danh sach ngan hang:");
        for (NganHang nganHang : danhSachNganHang) {
            System.out.println(nganHang.toString());
        }
    }

    private static void nhapDanhSachSoTietKiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong so tiet kiem: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho so tiet kiem thu " + (i + 1));
            System.out.print("Nhap ma khach hang: ");
            String maKH = scanner.nextLine();
            KhachHang khachHang = null;
            for (KhachHang kh : danhSachKhachHang) {
                if (kh.getMaKH().equals(maKH)) {
                    khachHang = kh;
                    break;
                }
            }
            if (khachHang == null) {
                System.out.println("Khach hang khong ton tai.");
                continue;
            }
            System.out.print("Nhap ma ngan hang: ");
            String maNganHang = scanner.nextLine();
            NganHang nganHang = null;
            for (NganHang ng : danhSachNganHang) {
                if (ng.getTenNH().equals(maNganHang)) {
                    nganHang = ng;
                    break;
                }
            }
            if (nganHang == null) {
                System.out.println("Ngan hang khong ton tai.");
                continue;
            }
            System.out.print("Nhap so tien gui: ");
            double soTienGui = scanner.nextDouble();
            scanner.nextLine();
            SoTietKiem soTietKiem = new SoTietKiem(KhachHang, nganHang, soTienGui);
            danhSachSoTietKiem.add(soTietKiem);
        }
    }

    private static void inDanhSachSoTietKiem() {
        System.out.println("Danh sach so tiet kiem:");
        for (SoTietKiem soTietKiem : danhSachSoTietKiem()) {
            System.out.println(soTietKiem);
        }
    }

    private static void sapXepTheoHoTen() {
        Collections.sort(danhSachKhachHang, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang khachHang1, KhachHang khachHang2) {
                return khachHang1.getHoTen().compareTo(khachHang2.getHoTen());
            }
        });
        System.out.println("Danh sach khach hang sau khi sap xep theo ho ten:");
        inDanhSachKhachHang();
    }

    private static void sapXepTheoSoTienGui() {
        Collections.sort(danhSachSoTietKiem, new Comparator<SoTietKiem>() {
            @Override
            public int compare(SoTietKiem soTietKiem1, SoTietKiem soTietKiem2) {
                if (soTietKiem1.getSoTienGui() < soTietKiem2.getSoTienGui()) {
                    return 1;
                } else if (soTietKiem1.getSoTienGui() > soTietKiem2.getSoTienGui()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Danh sach so tiet kiem sau khi sap xep theo so tien gui giam dan:");
        inDanhSachSoTietKiem();
    }

    private static void tinhTongSoTienGui() {
        System.out.println("Bang ke tong so tien gui cua moi khach hang:");
        for (KhachHang khachHang : danhSachKhachHang) {
            double tongSoTienGui = 0;
            for (TaiKhoan taiKhoan : khachHang.getDanhSachTaiKhoan()) {
                tongSoTienGui += taiKhoan.getSoTien();
            }
            System.out.println(khachHang.getMaKH() + " - " + khachHang.getHoTen() + " - " + tongSoTienGui);
        }
    }

    private static void luuDuLieuVaoFile() {
        try (FileWriter writer = new FileWriter("data.txt");
             BufferedWriter bw = new BufferedWriter(writer)) {
            for (KhachHang khachHang : danhSachKhachHang) {
                bw.write(khachHang.getMaKH() + "," + khachHang.getHoTen() + "," + khachHang.getDiaChi() + ","
                        + khachHang.getSoDT() + "\n");
            }

            for (NganHang nganHang : danhSachNganHang) {
                bw.write(nganHang.getMaNH() + "," + nganHang.getTenNH() + "," + nganHang.getLaiSuat() + "\n");
            }

            for (SoTietKiem soTietKiem : danhSachSoTietKiem) {
                bw.write(soTietKiem.getKhachHang().getMaKH() + "," + soTietKiem.getNganHang().getMaNH() + ","
                        + soTietKiem.getSoTienGui() + "\n");
            }

            System.out.println("Luu du lieu vao file thanh cong.");

        } catch (IOException ex) {
            System.err.format("Loi: %s%n", ex);
        }
    }

    private static void loadData() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;
        String[] elements;

        while ((line = br.readLine()) != null) {
            elements = line.split(",");
            if (elements.length == 4) { // KhachHang
                String maKH = elements[0].trim();
                String hoTen = elements[1].trim();
                String diaChi = elements[2].trim();
                String soDienThoai = elements[3].trim();
                KhachHang khachHang = new KhachHang(maKH, hoTen, diaChi, soDienThoai);
                danhSachKhachHang.add(khachHang);
            } else if (elements.length == 3) { // NganHang
                String maNganHang = elements[0].trim();
                String tenNganHang = elements[1].trim();
                double laiSuat = Double.parseDouble(elements[2].trim());
                NganHang nganHang = new NganHang(maNganHang, tenNganHang, laiSuat);
                danhSachNganHang.add(nganHang);
            } else if (elements.length == 6) {
                String maKH = elements[0].trim();
                String maNganHang = elements[1].trim();
                double soTienGui = Double.parseDouble(elements[2].trim());
                LocalDate ngayMoSo = LocalDate.parse(elements[3].trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalDate ngayDenHan = LocalDate.parse(elements[4].trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                double laiSuat = Double.parseDouble(elements[5].trim());

                KhachHang khachHang = findKhachHangByMaKH(maKH);
                NganHang nganHang = findNganHangByMaNganHang(maNganHang);

                if (khachHang != null && nganHang != null) {
                    SoTietKiem soTietKiem = new SoTietKiem(KhachHang, nganHang, soTienGui, ngayMoSo, ngayDenHan, laiSuat);
                    danhSachSoTietKiem.add(soTietKiem);
                }
            }
        }
        br.close();
    }

    private static entity.KhachHang findKhachHangByMaKH(String maKH) {
        return null;
    }

    private static NganHang findNganHangByMaNganHang(String maNganHang) {
        return null;
    }

}
package entity;

public class NganHang {
        private int maNH;
        private String tenNH;
        private double laiSuat;

        // Constructor
        public NganHang(String tenNH, double laiSuat) {
            this.tenNH = tenNH;
            this.laiSuat = laiSuat;
            this.maNH = generateMaNH();
        }

    public NganHang(String maNganHang, String tenNganHang, double laiSuat) {

    }

        public int getMaNH() {
            return maNH;
        }

        public String getTenNH() {
            return tenNH;
        }

        public void setTenNH(String tenNH) {
            this.tenNH = tenNH;
        }

        public double getLaiSuat() {
            return laiSuat;
        }

        public void setLaiSuat(double laiSuat) {
            this.laiSuat = laiSuat;
        }

        // Generate unique bank ID
        private int generateMaNH() {
            return 0;
        }
    }

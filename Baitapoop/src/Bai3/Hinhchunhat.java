package Bai3;

public class Hinhchunhat {
        String chieurong;
        String chieucao;
        String mau;

        public Hinhchunhat() {
        }

        public Hinhchunhat(String chieurong, String chieucao, String mau) {
            this.chieurong = chieurong;
            this.chieucao = chieucao;
            this.mau = mau;
        }

        public String getChieurong() {
            return chieurong;
        }

        public void setChieurong(String chieurong) {
            this.chieurong = chieurong;
        }

        public String getChieucao() {
            return chieucao;
        }

        public void setChieucao(double height) {
            this.chieucao = chieucao;
        }

        public String getMau() {
            return mau;
        }

        public void setMau(String color) {
            this.mau = mau;
        }

        public String dientich() {
            return this.chieurong * this.chieucao;
        }

        public double chuvi() {
            return (chieurong + this.chieurong) * 2;
        }

        public String hienthi() {
            return "Hinhchunhat{" + "Hinh chu nhat co chieu rong la: " + chieurong + ", Chieu cao la: =" + chieucao + ", Co mau la:=" + mau + "}";
        }
    }

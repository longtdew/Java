package constant;

public enum Booktype {
    KHTN("Khoa hoc tu nhien"),
    VHNT("Van hoc nghe thuat"),
    DTVT("Dien tu vien thong"),
    CNTT("Cong nghe thong tin");

    public String value;

    Booktype(String value) {
        this.value = value;
    }
}

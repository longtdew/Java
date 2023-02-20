package constant;

public enum Readertype {

    Student("Sinh vien"),
    Post_Student("Hoc vien cao hoc"),
    Teacher("Giao vien");
    public String value;

    Readertype(String value) {
        this.value = value;
    }
}

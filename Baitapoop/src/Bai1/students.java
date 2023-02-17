package Bai1;

public class students {
     String id;
     String name;
     String studentClass;
     int course;

    @Override
    public String toString() {
        return "students{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", course=" + course +
                '}';
    }

    public students (String id, String name, String studentClass, int course) {
        this.id = id;
        this.name = name;
        this.studentClass = studentClass;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public int getCourse() {
        return course;
    }
}
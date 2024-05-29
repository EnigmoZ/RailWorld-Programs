package School;

public class School {
    private String sname;
    private  String scity;
    private Student[] student;

    public School(String sname, String scity, Student[] student) {
        this.sname = sname;
        this.scity = scity;
        this.student = student;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getScity() {
        return scity;
    }

    public void setScity(String scity) {
        this.scity = scity;
    }

    @Override
    public String toString() {
        return "School{" +
                "sname='" + sname + '\'' +
                ", scity='" + scity + '\'' +
                '}';
    }
}

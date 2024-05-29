package School;

import java.util.Arrays;

public class Subject {
    private String[] subjects;

    public Subject(String[] subjects) {
        this.subjects = subjects;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjects=" + Arrays.toString(subjects) +
                '}';
    }
}

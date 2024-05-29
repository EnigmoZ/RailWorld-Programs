package Interfaces;

public class Student implements Comparable<Student> {
    private int physics;

    public Student(int physics){
        this.physics = physics;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    @Override
    public int compareTo(Student st) {
        if(this.physics == st.physics)
            return 0;
        else if(this.physics>st.physics){
            return 1;
        }
        else
            return -1;
    }
}

package Interfaces;

public class Main {


    public static void main(String[] args) {
        Student s1 = new Student(97);
        Student s2 = new Student(89);
        if(s1.compareTo(s2)==0){
            System.out.println("Student 1 and 2 have equal marks in physics");
        }
        else if(s1.compareTo(s2)>0){
            System.out.println("Student 2 have less marks than Student 1");
        }else{
            System.out.println("Student 1 have less marks than Student 2");
        }
    }
}

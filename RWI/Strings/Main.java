package Strings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "hello i am new";
        System.out.println(Arrays.toString(s.split(" ")));
        StringBuilder sb = new StringBuilder(s);
        String st = sb.reverse().toString();
        System.out.println(st);
    }
}

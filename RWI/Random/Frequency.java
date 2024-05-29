package Random;


import java.util.ArrayList;
import java.util.HashMap;

public class Frequency {

    public static ArrayList<Integer> solve(int[] arr, int k){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            } else {
                int n = map.get(j);
                map.put(j,++n);
            }
        }
        System.out.println(map);
        for(int i:map.keySet()){
            if(map.get(i)>=k){
                list.add(i);
            }
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,2,3};
        int k=2;
        ArrayList<Integer> list = new ArrayList<>(solve(arr, k));
        System.out.println(list);
    }

}

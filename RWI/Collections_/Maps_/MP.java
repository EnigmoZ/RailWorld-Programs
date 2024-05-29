package Collections_.Maps_;
import Collections_.ArrayLists_.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MP {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey("three"));
        System.out.println(map.containsValue(2));
        map.remove("three");
        map.replace("one", 10);
        System.out.println(map);
        Map<String, List<Employee>> map1 = new HashMap<String, List<Employee>>();
        List<Employee> l = new ArrayList<>();

        Employee emp1 = new Employee(1001,"Ansh","Dev");
        Employee emp2 = new Employee(1002,"Arpit", "Dev");

        l.add(emp1);
        l.add(emp2);

        map1.put("Development", l);
        System.out.println(map1);
    }
}

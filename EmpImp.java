package challengs1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee{
    int id;
    int importance;
    List<Integer> subordinates;
}

public class EmpImp {
    static Map<Integer,Employee> map = new HashMap<>();
    public static void main(String[] args) {
        //[[1,5,[2,3]],[2,3,[]],[3,3,[]]]
        int id = 1;
        Employee e1 = new Employee();
        e1.id=1;
        e1.importance=5;
        List<Integer> e1l=new ArrayList();
        e1l.add(2);
        e1l.add(3);
        e1.subordinates = e1l;

        Employee e2 = new Employee();
        e2.id=2;
        e2.importance=3;
        List<Integer> e2l=new ArrayList();
        e2.subordinates = e2l;

        Employee e3 = new Employee();
        e3.id=3;
        e3.importance=3;
        List<Integer> e3l=new ArrayList();
        e3.subordinates = e3l;

        map = new HashMap<>();
        map.put(e1.id,e1);
        map.put(e2.id,e2);
        map.put(e3.id,e3);

        //System.out.println(map.get(1));
        System.out.println(dfs(id));

    }

    static int dfs(int id){
        Employee emp = map.get(id);//base condition
        int result;
        result = emp.importance;
        for (int subId : emp.subordinates){
            result += dfs(subId);
        }
        return result;
    }
}

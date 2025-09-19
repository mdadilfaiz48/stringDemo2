import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Haris");
        stringList.add("Adil");
        stringList.add("Nazar");

        List<Employee> employees = new ArrayList<>();

        for(String s : stringList)
        {
            System.out.println("value is: "+ s);
        }

        Map<String, String> mapObject = new HashMap<>();
        mapObject.put("name", "haris");
        mapObject.put("fatherName","faiz alam");
        mapObject.put("mobile number", "97865333");

        System.out.println("map is "+ mapObject);
    }
}

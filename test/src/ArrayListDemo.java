
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        //add 5 friends name
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ashutod");
        nameList.add("Anchul");
        nameList.add("Amrat");
        nameList.add("Anurag");
        nameList.add("Arniket");
        for(String name : nameList){
            System.out.println(name);
        }
        System.out.println(nameList.get(4));
        //Sort the data
        Collections.sort(nameList);
        System.out.println(nameList);
        //reverse the array list element
        for(int i= nameList.size()-1;i>=0;i--){
            System.out.println(nameList.get(i));
        }
    }
}
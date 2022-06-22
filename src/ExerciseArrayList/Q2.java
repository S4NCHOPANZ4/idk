package ExerciseArrayList;

import javax.naming.NamingEnumeration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(10);
        List<Integer> arr2 = new ArrayList<>(10);
        Random ram = new Random();
        for(int i=0; i <= 9; i++){
            int addedNum = ram.nextInt(50-1)+1;
            arr.add(addedNum);
        }
        arr2.addAll(arr);
        arr.remove(arr.size()-1);
        arr.add(-5);

        System.out.println(arr);
        System.out.println(arr2);


    }
}
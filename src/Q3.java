import java.lang.reflect.Array;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<car> cars = new ArrayList<>();  List<Integer> cars1 = new ArrayList<>(); List<car> cars2 = new ArrayList<>();

        car car1 = new car("Sapo","MRKN",1420);
        car car2 = new car("Triple","DE",2077);
        car car3 = new car("Gnrra","MRD",1939);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars1.add(cars.get(0).year);
        cars1.add(cars.get(1).year);
        cars1.add(cars.get(2).year);
        Collections.sort(cars1);
        for(int i = 0; i <= cars.size()-1;i++){
            for(int j =0;j<= cars.size()-1;j++){
                if(cars.get(j).year == cars1.get(i)){
                    cars2.add(cars.get(j));
                }
            }
        }
        for(int i = 0; i<= cars2.size()-1;i++){
            System.out.println("Brand: "+ cars2.get(i).brand);
            System.out.println("Model: "+ cars2.get(i).model);
            System.out.println("Year:  "+cars2.get(i).year);
            System.out.println("---------------------------");
        }
    }
}



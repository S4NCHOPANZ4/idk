import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>(10);

        for(int i=0; i <= 9; i++){
            int addedNum = (int)(Math.random()*50+1);
            arr.add(addedNum);
        }
        System.out.print("Enter your num: ");
        int userInput = scan.nextInt();
        scan.close();

        for(int nums: arr){
            if (nums == userInput){
                System.out.println("Your num is in the list!");
                System.out.println(arr);
                break;
            }
            else{
                System.out.println("Your num is not in the list!");
                System.out.println(arr);
                break;
            }
        }
    }
}

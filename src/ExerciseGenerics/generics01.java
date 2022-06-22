package ExerciseGenerics;

public class  generics01{
    public static void main(String[] args) {
        numMax<Integer> numM = new numMax<>(1,2,3);
        int i = numM.maxN();
        System.out.println(i);
        numMax<Double> numM1 = new numMax<>(1.2,2.4,3.5);
        double a = numM1.maxN();
        System.out.println(a);
    }
}
class numMax<T extends Number>{
    T num;
    T num1;
    T num2;
    numMax(T num,T num1, T num2){
        this.num = num;
        this.num1 = num1;
        this.num2 = num2;
    }
    T maxN(){
        T max= num;
        if(num1.doubleValue() > max.doubleValue()){
            max = num1;
        }
        if(num2.doubleValue() > max.doubleValue()){
            max = num2;
        }
        return max;
    }
}


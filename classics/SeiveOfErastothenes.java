package classics;

import java.util.ArrayList;

public class SeiveOfErastothenes {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbersPrime = new ArrayList<>();
        ArrayList<Integer> myPrime = new ArrayList<>();

        for(int i=2 ; i<=100; i++){
           numbers.add(i);
        }

        System.out.println("The List of numbers  "+ numbers);

        for(int i = 2; i<=100;){
            int prime = 1;
            for(int loop = 2; loop <=i; loop++) {
                if ((i % loop) == 0 && loop != i) {
                    prime = 0;
                    break;
                }
            }
            if (prime != 0){
                numbersPrime.add(i);
                i++;
            }
            else
                i ++;
        }

        for(int x: numbers){
            boolean flag = true;
            for(int k =2; k<=x ; k++){
                if (x % k == 0 && x != k) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                myPrime.add(x);
            }
        }

        System.out.println("The prime numbers  "+ numbersPrime);
        System.out.println("My prime numbers  "+ myPrime);
    }

}

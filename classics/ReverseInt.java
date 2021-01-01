package classics;

public class ReverseInt {
    public static void main(String[] args) {
        int x= -123;
        int reverse = 0;

        while(x!=0){
            int y  = x%10;
            reverse = reverse * 10 + y;
            x = x/10;
        }

        System.out.println("The reverse of the number " + reverse);

    }
}

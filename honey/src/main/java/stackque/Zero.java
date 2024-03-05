package stackque;
import java.util.Scanner;
import java.util.Stack;

public class Zero {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int K = scr.nextInt();

        Stack<Integer> num = new Stack<>();
        int sum = 0;
        int index ;


        for(int i = 0 ; i<K ; i++){
            index=scr.nextInt();
            if(index ==0){
                sum -= num.pop();
            }
            else{sum += index;
            num.push(index);}

        }

        System.out.println(sum);



    }
}

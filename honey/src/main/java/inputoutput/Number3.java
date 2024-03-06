package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        String num2 = br.readLine();


        int sum=0;
        int temp=0;
        for(int i = 0 ; i<3 ; i++){
            temp=num1*Integer.parseInt(String.valueOf(num2.charAt(2-i)));
            System.out.println(temp);
            sum += temp*(int)Math.pow(10,i);
        }
        System.out.println(sum);



    }
}



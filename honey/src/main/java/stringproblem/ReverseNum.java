package stringproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseNum {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder num1 = new StringBuilder(st.nextToken());
        StringBuilder num2 = new StringBuilder(st.nextToken());

        num1.reverse();
        num2.reverse();

        int a = Integer.parseInt(String.valueOf(num1));
        int b = Integer.parseInt(String.valueOf(num2));

        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}

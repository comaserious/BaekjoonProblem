package stackque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Snack {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        StringTokenizer x = new StringTokenizer(br.readLine());
        Stack<Integer> stay = new Stack<>();
        Stack<Integer> end = new Stack<>();
        int n;

        for(int i = 1 ; i<=N ;i++){
            n = Integer.parseInt(x.nextToken());
            if(n != i){
                end.push(i);
            }
            else if(stay.isEmpty()){
                stay.push(n);
            }


        }

    }
}

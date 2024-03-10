package multifactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PerfectNum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n ;
        List<Integer> p = new ArrayList<>();
        while(true){
            n = Integer.parseInt(br.readLine());
            if(n == -1){
                break;
            }
            int sum =0;
            String answer ="";
            for(int i=1 ; i<n+1;i++){
                if(i == n){
                    continue;
                }
                if(n%i==0){
                    p.add(i);
                    sum +=i;
                    answer = answer+i+" + ";
                }
            }
            if(sum==n){
                System.out.println(n+" = "+answer.substring(0,answer.length()-3));
            }
            else{
                System.out.println(n+" is NOT perfect.");
            }


        }
    }
}

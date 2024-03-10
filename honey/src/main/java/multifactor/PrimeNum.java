package multifactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PrimeNum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count =0;
        int num;
        List<Integer> factor =null;
        while(st.hasMoreTokens()){
            factor = new ArrayList<>();
            num = Integer.parseInt(st.nextToken());
            if(num%2==0 && num!=2){
                continue;
            }
            for(int i =1 ; i<num+1;i++){
                if(num%i==0){
                    factor.add(i);
                }
            }
            if(factor.size()==2){
                count++;
            }
        }

        System.out.println(count);
    }
}

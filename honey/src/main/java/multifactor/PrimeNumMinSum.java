package multifactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumMinSum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        List<Integer> factor = new ArrayList<>();
        int sum = 0;
        for(int i = M ; i<N+1;i++){
            if(i == 1){
                continue;
            }
            if(i==2){
                factor.add(i);
                sum+=i;
                continue;
            }
            if(i%2==0){
                continue;
            }
            boolean isPrime = true;
            for(int j =3;j<i;j++){
                if(i%j  == 0){
                    isPrime= false;
                    break;
                }

            }
            if(isPrime){
                factor.add(i);
                sum+=i;
            }


        }
        if(factor.isEmpty()){
            System.out.println(-1);
        }else {
        System.out.println(sum);
        System.out.println(factor.get(0));

        }

    }
}

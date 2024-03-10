package multifactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Factors {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> factor =  new LinkedList<>();

        for(int i = 1 ; i<N+1;i++){
            if(N%i==0){
                factor.add(i);
            }
        }
        if(factor.size()>=K){
            System.out.println(factor.get(K-1));
        }else {
            System.out.println(0);
        }
    }
}

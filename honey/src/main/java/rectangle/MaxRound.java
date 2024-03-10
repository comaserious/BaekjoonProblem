package rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxRound {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] line = new int[3];
        int sum = 0;
        for(int i = 0 ; i <3 ;i++){
            line[i] = Integer.parseInt(st.nextToken());
            sum += line[i];
        }
        int max = Arrays.stream(line).max().getAsInt();
        if(2*max>=sum){
            System.out.println((sum-max)*2-1);
        }
        else{
            System.out.println(sum);
        }
    }
}

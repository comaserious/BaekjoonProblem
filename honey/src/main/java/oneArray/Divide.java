package oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divide {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] remain = new int[42];
        int num ;
        for(int i = 0 ; i < 10 ; i++){
            num=Integer.parseInt(br.readLine())%42;
            remain[num] +=1;
        }

        int count = 0;
        for(int i =0 ; i<42; i++){
            if(remain[i]!=0){
                count++;
            }
        }
        System.out.println(count);

    }
}

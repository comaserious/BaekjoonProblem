package oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhereMax {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] numbers = new int[9];
        for(int i = 0 ; i<9 ; i++){
            numbers[i]=Integer.parseInt(br.readLine());
        }

        int max =0;

        for(int i = 1 ; i<9;i++){
            if (numbers[max]<numbers[i]) {
                max = i;
            }
        }
        System.out.println(numbers[max]);
        System.out.println(max+1);



    }
}

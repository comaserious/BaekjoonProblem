package repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowLong {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int n= N/4;
        String s ="int";
        for(int i = 0 ; i<n; i++){
            s="long "+s;
        }
        System.out.println(s);


    }
}

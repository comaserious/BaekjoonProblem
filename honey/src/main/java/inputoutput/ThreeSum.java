package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreeSum {

    public static void main(String[] args) throws IOException ,NumberFormatException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long sum =0;
        while(st.hasMoreTokens()){
            sum += Long.parseLong(st.nextToken());
        }
        System.out.println(sum);
    }
}

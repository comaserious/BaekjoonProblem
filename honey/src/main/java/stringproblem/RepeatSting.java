package stringproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RepeatSting {

    public static void main(String[] args) throws IOException {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            String a ="";
            for(int j= 0 ; j<s.length();j++){
                for(int k = 0 ; k < c ; k++){
                    a=a+s.charAt(j);
                }
            }
            System.out.println(a);

        }

    }
}

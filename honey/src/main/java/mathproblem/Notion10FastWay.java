package mathproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Notion10FastWay {

    public static void main(String[] args) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer s = new StringTokenizer(br.readLine());

        StringBuilder st = new StringBuilder(s.nextToken());

        st.reverse();
        int notion = Integer.parseInt(s.nextToken());
        int num;
        int result =0;
        for(int i = 0 ; i<st.length();i++){
            num = st.charAt(i);
            if(num >='A'){
                num = num-'A'+10;
            }
            result += num*(int)Math.pow(notion,i);

        }
        System.out.println(result);

    }
}

package stackque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PS {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i =0 ; i<T;i++) {

            String s = br.readLine();
            while(s.contains("()")) {
                s = s.replace("()", "");
            }
            if(s.isEmpty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }



    }

}


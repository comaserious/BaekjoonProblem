package hardmode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class GroupWord {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<Character> check  = new HashSet<>();

        int count = 0;
        for(int j = 0 ; j < N ; j++) {
            String s = br.readLine();
            for (int i = 0; i < s.length(); i++) {

                if (!check.add(s.charAt(i))) {
                    if(i==0){
                        continue;
                    }
                    if(s.charAt(i) != s.charAt(i-1)){
                        --count;
                        break;
                    }

                }
            }
            check.clear();

            ++count;
        }

        System.out.println(count);
    }
}
package conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Dice {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> l = new ArrayList<>();

        while(st.hasMoreTokens()){
            l.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(l);

        if(l.get(0) == l.get(1)){
            if(l.get(1)==l.get(2)){
                System.out.println(l.get(0)*1000+10000);
            }
            else {
                System.out.println(l.get(0)*100+1000);
            }
        }
        else if(l.get(1)==l.get(2)){
            System.out.println(l.get(1)*100+1000);
        }
        else {
            System.out.println(l.get(2)*100);
        }



    }
}

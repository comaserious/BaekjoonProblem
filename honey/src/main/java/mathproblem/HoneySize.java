package mathproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoneySize {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());


        int opener = 1;
        int closer = 2;
        int layer =1;
        while(true){

            if(x>=opener && x<closer){
                System.out.println(layer);
                break;
            }

            opener = closer;
            closer = opener + 6*layer;
            ++layer;

        }



    }
}

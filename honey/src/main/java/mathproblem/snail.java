package mathproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class snail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] elements = br.readLine().split("\\s+");
        int A = Integer.parseInt(elements[0]);
        int B = Integer.parseInt(elements[1]);
        int V = Integer.parseInt(elements[2]);

        int height=0;
        int day =0;

       while(true){

           height +=A;
           if(V < height){
               System.out.println(day);
               break;
           }
           height -=B;
           ++day;
       }
    }

}

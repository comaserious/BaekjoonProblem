package rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RemainPosition {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x =new int[2];
        int[] y = new int[2];
        int x1;
        int y1;
         for(int i = 0 ; i <2;i++){
             StringTokenizer st = new StringTokenizer(br.readLine());
             x[i] = Integer.parseInt(st.nextToken());
             y[i] = Integer.parseInt(st.nextToken());
         }
         StringTokenizer st1 = new StringTokenizer(br.readLine());
         x1 =Integer.parseInt(st1.nextToken());
         y1 = Integer.parseInt(st1.nextToken());
         if(x[0]==x[1]){
             System.out.print(x1);
         }
         else if(x[0]==x1){
             System.out.print(x[1]);
         }else {
             System.out.print(x[0]);
         }
         if(y[0]==y[1]){
             System.out.print(" "+y1);
         }
         else if(y[0]==y1){
             System.out.print(" "+y[1]);
         }else{
             System.out.print(" "+y[0]);
         }


    }
}

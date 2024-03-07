package oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindSmall {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2  = new StringTokenizer(br.readLine());
        int T =Integer.parseInt(st1.nextToken());
        int X = Integer.parseInt(st1.nextToken());
        int [] A = new int[T];
        String asw="";
        for(int i = 0 ; i<T; i++){

            A[i]=Integer.parseInt(st2.nextToken());

            if(X>A[i]){
                asw = asw+A[i]+" ";
            }


        }
        System.out.println(asw);


    }
}

package oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThrowingBall {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st =new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        int[] box = new int[N];

        for(int l = 0 ; l < M;l++){
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int i = Integer.parseInt(st2.nextToken());
        int j = Integer.parseInt(st2.nextToken());
        int k = Integer.parseInt(st2.nextToken());

        for(int t = i-1 ; t<=j-1 ; t++){
            box[t]=k;
        }
        }

        for(int i : box){
            System.out.print(i+" ");
        }





    }
}

package oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class ChangeBall {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N  = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] box = new int[N];
        for(int i = 0 ; i < N ;i++){
            box[i]=i+1;
        }

        int temp;

        for(int t = 0 ;t < M ; t++){

            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st1.nextToken())-1;
            int j = Integer.parseInt(st1.nextToken())-1;

            temp = box[i];
            box[i]=box[j];
            box[j]=temp;

        }
        for(int i : box){
            System.out.print(i+" ");
        }


    }
}

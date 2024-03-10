package rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MininumArea {

    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] x = new int[N];
        int[] y = new int[N];

        for(int i = 0  ; i < N ; i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            x[i]=Integer.parseInt(st.nextToken());
            y[i]=Integer.parseInt(st.nextToken());
        }

        int bo = Arrays.stream(x).max().getAsInt()-Arrays.stream(x).min().getAsInt();
        int he = Arrays.stream(y).max().getAsInt()-Arrays.stream(y).min().getAsInt();

        System.out.println(bo*he);




    }
}

package matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Sum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<int[][]> matrix = new ArrayList<>();
        for(int k= 0 ; k <2; k++){
            int[][] m = new int[N][M];
            for(int i = 0 ; i < N ;i++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < M ;j++){
                    m[i][j]= Integer.parseInt(st1.nextToken());
                }
            }
            matrix.add(m);
        }

        for(int i = 0; i <N;i++){
            for(int j = 0 ; j < M; j++){
                System.out.print(matrix.get(0)[i][j]+matrix.get(1)[i][j]+" ");
            }
            System.out.println();
        }
    }
}

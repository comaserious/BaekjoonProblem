package matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matrix = new int[9][9];
        int row = 0;
        int col = 0;
        for(int i=0 ; i < 9 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j =0 ; j < 9 ; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if(matrix[row][col]<matrix[i][j]){
                    row=i;
                    col=j;
                }

            }
        }

        System.out.println(matrix[row][col]);
        System.out.println((row+1)+" "+(col+1));
    }
}

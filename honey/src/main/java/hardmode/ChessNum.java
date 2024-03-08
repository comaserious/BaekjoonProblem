package hardmode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChessNum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.print(1-Integer.parseInt(st.nextToken())+" ");
        System.out.print(1-Integer.parseInt(st.nextToken())+" ");
        System.out.print(2-Integer.parseInt(st.nextToken())+" ");
        System.out.print(2-Integer.parseInt(st.nextToken())+" ");
        System.out.print(2-Integer.parseInt(st.nextToken())+" ");
        System.out.print(8-Integer.parseInt(st.nextToken())+" ");



    }
}

package conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Clockfast45 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int full = H*60+M-45;

        if(full < 0){
            System.out.println(23+" "+(full+60));
        }
        else{
            System.out.println(full/60+" "+full%60);
        }
    }
}

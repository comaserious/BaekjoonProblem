package oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class FindV {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(br.readLine());
        int count=0;

        while(st.hasMoreTokens()){
            if(V==Integer.parseInt(st.nextToken())){
                count++;
            }
        }
        System.out.println(count);

    }
}

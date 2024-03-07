package oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Reverse {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String box = "";
        for(int i = 1 ; i <=N; i++){
            box = box+i;
        }

        for(int t = 0; t < M ;t++){
            StringBuilder rebox = new StringBuilder();
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st1.nextToken())-1;
            int j = Integer.parseInt(st1.nextToken());
            rebox.append(box.substring(i,j));
            box=box.replace(rebox,rebox.reverse());

        }
        for(int i =0 ; i<box.length();i++){
            System.out.print(box.charAt(i)+" ");
        }

    }
}

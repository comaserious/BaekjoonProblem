package repeat;

import java.io.*;
import java.util.StringTokenizer;

public class repeatAuto {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int first;
        int second;
        String sum;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());

            if(first == 0 && second ==0){
                break;
            }
            else{
                sum = String.valueOf(first+second);
                bw.write(sum);
                bw.write("\n");
            }


        }
        bw.flush();
    }
}

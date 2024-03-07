package repeat;

import java.io.*;

import java.util.StringTokenizer;

public class EOF {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int first ;
        int second;

        while(true){

            String end = br.readLine();
            if(end == null){
                break;
            }

            StringTokenizer st = new StringTokenizer(end);

            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());
            String sum = String.valueOf(first+second);
            bw.write(sum);
            bw.write("\n");
            bw.flush();

        }


    }




}

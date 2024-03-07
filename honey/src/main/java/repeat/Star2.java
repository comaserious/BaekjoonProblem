package repeat;

import java.io.*;


public class Star2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N= Integer.parseInt(br.readLine());
        String empty ="";
        for(int i = 0 ; i<N ; i++){

            for(int j = 1 ; j<N-i;j++){
                empty+=" ";
            }
            for(int k =0; k<i+1;k++){
                empty +="*";
            }
            bw.write(empty+"\n");
            bw.flush();
            empty="";

        }

    }
}

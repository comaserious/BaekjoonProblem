package stringproblem;

import java.io.*;



public class printout {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "";
        while((s =br.readLine())!=null){
            System.out.println(s);
        }


    }
}

package hardmode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sameReverse {

    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String origin = br.readLine();

        StringBuilder convert = new StringBuilder(origin);

        convert.reverse();
        String compare = String.valueOf(convert);
        if(origin.equals(compare)){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

    }
}

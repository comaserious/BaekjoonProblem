package oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BringAssign {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean [] isAss = new boolean[30];
        int index;
        for(int i = 0 ; i < 28 ; i++){
            index = Integer.parseInt(br.readLine())-1;
            isAss[index]=true;
        }

        for(int i = 0 ; i < 30 ;i++){
            if(isAss[i]==false){
                System.out.println(i+1);
            }
        }
    }
}

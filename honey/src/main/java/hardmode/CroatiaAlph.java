package hardmode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatiaAlph {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int count = 0;
        for(int i = 0 ; i<s.length();i++){

            count++;
            if(s.charAt(i)=='='){
                count--;
                if(i!=1){

                if(s.charAt(i-1)=='z'&&s.charAt(i-2)=='d'){

                    count--;
                }

                }
            }
            else if(s.charAt(i)=='-'){
                count--;
            }
            if(i!=0){
                if(s.charAt(i)=='j'&&(s.charAt(i-1)=='n'||s.charAt(i-1)=='l')){
                count--;
            }
            }




        }
        System.out.println(count);

    }
}

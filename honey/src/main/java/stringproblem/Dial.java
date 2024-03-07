package stringproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        int sum =0;
        for(int i = 0 ; i < num.length();i++){
            switch(num.charAt(i)){
                case 'A' : sum +=3;break;
                case 'B' : sum +=3;break;
                case 'C' : sum +=3;break;
                case 'D' : sum +=4;break;
                case 'E' : sum +=4;break;
                case 'F' : sum +=4;break;
                case 'G' : sum +=5;break;
                case 'H' : sum +=5;break;
                case 'I' : sum +=5;break;
                case 'J' : sum +=6;break;
                case 'K' : sum +=6;break;
                case 'L' : sum +=6;break;
                case 'M' : sum +=7;break;
                case 'N' : sum +=7;break;
                case 'O' : sum +=7;break;
                case 'P' : sum +=8;break;
                case 'Q' : sum +=8;break;
                case 'R' : sum +=8;break;
                case 'S' : sum +=8;break;
                case 'T' : sum +=9;break;
                case 'U' : sum +=9;break;
                case 'V' : sum +=9;break;
                case 'W' : sum +=10;break;
                case 'X' : sum +=10;break;
                case 'Y' : sum +=10;break;
                case 'Z' : sum +=10;break;

            }
        }

        System.out.println(sum);


    }
}

package mathproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Notion10 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1=0;
        String str = br.readLine();
        StringTokenizer nums = new StringTokenizer(str);
        String num = nums.nextToken();
        int notion = Integer.parseInt(nums.nextToken());
        int[] number = new int[num.length()];

        for(int i = 0 ; i< num.length();i++){

            char weirdNum = num.charAt(i);
            switch(weirdNum){
                case 'A': number[i]=10; break;
                case 'B': number[i]=11; break;
                case 'C': number[i]=12; break;
                case 'D': number[i]=13; break;
                case 'E': number[i]=14; break;
                case 'F': number[i]=15; break;
                case 'G': number[i]=16; break;
                case 'H': number[i]=17; break;
                case 'I': number[i]=18; break;
                case 'J': number[i]=19; break;
                case 'K': number[i]=20; break;
                case 'L': number[i]=21; break;
                case 'M': number[i]=22; break;
                case 'N': number[i]=23; break;
                case 'O': number[i]=24; break;
                case 'P': number[i]=25; break;
                case 'Q': number[i]=26;break;
                case 'R': number[i]=27;break;
                case 'S': number[i]=28;break;
                case 'T': number[i]=29;break;
                case 'U': number[i]=30;break;
                case 'V': number[i]=31;break;
                case 'W': number[i]=32;break;
                case 'X': number[i]=33;break;
                case 'Y': number[i]=34;break;
                case 'Z': number[i]=35;break;
                default: number[i] = Integer.parseInt(String.valueOf(num.charAt(i)));break;

            }



        }

        for(int i = 0 ; i<num.length();i++){

            num1 += number[num.length()-1-i]*(int)Math.pow(notion,i);
        }

        System.out.println(num1);




    }
}

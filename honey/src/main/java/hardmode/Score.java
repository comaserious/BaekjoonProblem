package hardmode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Score {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double downsum = 0;
        double uppersum = 0;
        double num ;
        for(int i = 0 ; i < 20 ; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            Double point = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(grade.equals("F")){
                downsum += point;
            }
            else if (grade.equals("P")){

            }
            else{
                num = 'D'-grade.charAt(0)+1.0;
                if(grade.charAt(1) == '+'){
                    num +=0.5;
                }
                uppersum += num*point;
                downsum += point;
            }



        }
        System.out.println(uppersum/downsum);

    }
}

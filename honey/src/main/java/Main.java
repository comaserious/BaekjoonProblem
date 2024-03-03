import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer s = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(s.nextToken());
        int n = s.nextToken().charAt(0);

        if(n>='A'){
            n = n-'A'+10;
        }

        int upper =0 ;

        while(N> (int)Math.pow(n,upper)){
            ++upper;
        }
        List<Integer> count = new ArrayList<>();

        for(int i =upper-1;i>=0;i--){
            count.add(N/(int)Math.pow(n,i));
            N=N%(int)Math.pow(n,i);
        }

        char c;
        String result;
        for(int i = 0 ; i<upper;i++){

        if(n>=10){
            n = n-10+'A';
            if(count.get(i)>=10){
                c =(char)(count.get(i)-10+'A');
            }
            String.valueOf(count.get(i)).concat(String.valueOf(n)) ;

        }



        }


    }
}

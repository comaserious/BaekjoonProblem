package hardmode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Star {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<String> stack = new Stack<>();

        for(int i = 0 ; i <N ; i++){
            String s="";
            for(int j =N-i-1 ; j > 0 ;j--){
                s = s+" ";
            }
            for(int j = 0 ;j<2*i+1;j++ ){
                s = s+"*";
            }

            stack.push(s);
            System.out.println(s);
        }
        stack.pop();
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }



    }
}

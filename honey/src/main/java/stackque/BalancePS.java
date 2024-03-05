package stackque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancePS {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("입력");
        String st = br.readLine();

        Stack<Character> s = new Stack<>();

        for(int i = 0 ; i< st.length();i++){

            if(st.indexOf(i) == '('  ){
                s.push('(');
            }
            else if ( s.indexOf(i)=='['){
                s.push('[');
            }
            else if(st.indexOf(i) == ')'){
                if(s.peek() == '['){
                    System.out.println("no");
                    break;
                }
                else if (s.isEmpty()){
                    System.out.println("no");
                    break;
                }
                else{
                   s.pop();
                }

            }

            else if (st.indexOf(i)==']'){
                if(s.peek() == '('){
                    System.out.println("no");
                    break;
                }
                else if (s.isEmpty()){
                    System.out.println("no");
                    break;
                }
                else {
                    s.pop();
                }

            }
            else if (st.indexOf(i)== '.'){
                if(s.isEmpty()){
                    System.out.println("yes");
                    break;
                }
                else{
                    System.out.println("no");
                    break;
                }
            }
        }



    }


}


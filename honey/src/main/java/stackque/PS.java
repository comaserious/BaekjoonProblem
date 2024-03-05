package stackque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class PS {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder st = new StringBuilder();

        for (int i = 0; i < T; i++) {
            st.append(br.readLine());



            while (st.indexOf("()") != -1) {
                int num =st.indexOf("()");
                st.deleteCharAt(num);
                st.deleteCharAt(num);

            }

            if (st.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


        }
    }
}

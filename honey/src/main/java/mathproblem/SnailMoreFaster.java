package mathproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnailMoreFaster {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] elements = br.readLine().split("\\s+");
        int A = Integer.parseInt(elements[0]);
        int B = Integer.parseInt(elements[1]);
        int V = Integer.parseInt(elements[2]);

        int lastOne = V - A;

        if (lastOne % (A - B) == 0) {
            System.out.println(lastOne / (A - B) + 1);
        } else {
            if (lastOne > (A - B)) {
                System.out.println(lastOne / (A - B) + 2);
            } else {
                System.out.println(2);
            }

        }
    }
}

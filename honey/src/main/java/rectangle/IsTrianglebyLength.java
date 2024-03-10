package rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class IsTrianglebyLength {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int[] line = new int[3];
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0 ;i<3;i++) {
                line[i] = Integer.parseInt(st.nextToken());
                sum += line[i];
            }
            if(line[0]==0&&line[1]==0&&line[2]==0) {
                break;
            }

            if (2 *Arrays.stream(line).max().getAsInt() >= sum) {
                System.out.println("Invalid");
            } else if (line[0] == line[1] && line[1] == line[2]) {
                System.out.println("Equilateral");
            } else if (line[0] == line[1] || line[0] == line[2] || line[1] == line[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}

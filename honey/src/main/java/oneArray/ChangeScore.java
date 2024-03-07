package oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class ChangeScore {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Double> arr = new LinkedList<>();

        for(int i = 0 ; i < N;i++){
            arr.add(Double.parseDouble(st.nextToken()));
        }
        Collections.sort(arr);

        double max = arr.get(N-1);
         double sum =0;
        for(int i = 0 ; i < N;i++){
            sum += arr.get(i)*100/max;
        }
        System.out.println(sum/N);

    }
}

package oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class MinMax {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> arr = new LinkedList<>();

        for(int i = 0 ; i < N ; i++){
            arr.add(Integer.valueOf(st.nextToken()));

        }

        Collections.sort(arr);

        System.out.println(arr.get(0)+" "+arr.get(N-1));

    }
}

package matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ColumnREad {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> word = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            word.add(br.readLine());
        }

        for(int j = 0 ; j <15 ;j++){
            for(int i = 0 ; i<5;i++){
                if(word.get(i).length() < j+1){
                    continue;
                }
                System.out.print(word.get(i).charAt(j));
            }
        }

    }
}

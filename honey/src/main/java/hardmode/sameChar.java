package hardmode;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class sameChar {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        s = s.toLowerCase();
        Set<Character> carr = new HashSet<>();

        for(int i = 0 ; i < s.length();i++){
            carr.add(s.charAt(i));
        }

        Iterator iterator = carr.iterator();
        List<Character> c = new ArrayList<>();
        while(iterator.hasNext()){
            c.add((Character) iterator.next());
        }
        List<Integer> countarray = new ArrayList<>();
        int count ;
        for(int i = 0 ; i < c.size();i++){
            count = 0;
            for(int j = 0 ; j < s.length();j++){
                if(s.charAt(j)==c.get(i)){
                    count++;
                }
            }
            countarray.add(count);
        }

        int max = 0;
        for(int i =1 ; i<countarray.size();i++){
            if(countarray.get(max) <countarray.get(i)){
                max = i;
            }
        }
        int p = 0;
        for(int i = 0 ; i<countarray.size();i++){
            if(i == max){
                continue;
            }
            if(countarray.get(max)== countarray.get(i)){
                p = 1;
            }
        }

        if(p==1){
            System.out.println("?");
        }else{
        System.out.println(String.valueOf(c.get(max)).toUpperCase());}

    }
}

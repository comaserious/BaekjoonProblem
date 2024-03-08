package hardmode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class sameCharVerTwo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        Set<Character> cSet = new HashSet<>();
        List<Integer> countArray = new ArrayList<>();
        List<Character> c = new ArrayList<>();
        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(cSet.add(ch)){
                // 이제 보니 Set 에 add 할때 중복 된것을 집어 넣을때
                // boolean 타입으로 false를 반환 또는 중복이 아니면 Set 컬렉션에 저장하면서
                // true 를 반환하는듯
                countArray.add(1);
                c.add(ch);
            }
            else{
                int index = c.indexOf(ch);
                countArray.set(index, countArray.get(index)+1);
            }
        }
        int maxCount = Collections.max(countArray);
        int maxCountIndex = countArray.indexOf(maxCount);

        boolean isTie =(maxCountIndex != countArray.lastIndexOf(maxCount));
        // 2개 이상이면 결국 겹치는 거니깐 indexOf를 통해서 가장 큰숫자의 인덱스 번호와
        // lastIndexOf 를 통해서 가장 마지막 큰숫자와 인덱스 번호를 찾아내어
        // 만약 다르면 결국 같은 숫자가 적어도 2개 라는 뜻 따라서 boolean 으로 받아서
        // true or false 를 반환 받아 ? 또는 숫자를 만들어내는 스킬
        if(isTie){
            System.out.println("?");
        }
        else {
            System.out.println(String.valueOf(c.get(maxCount)).toUpperCase());
        }

    }
}

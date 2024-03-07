package oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Reverse1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        int[] nums = new int[N];
        int T ;
        int temp;
        for(int i = 0 ; i < N ; i++){
            nums[i]=i+1;
        }

        for(int t = 0 ; t<M ; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;

            T = (j -i)%2;
            if(T == 0 ){
                for(int k = 0 ; k<(j-i)/2;k++   ){
                   temp = nums[i+k];
                   nums[i+k]=nums[j-k];
                   nums[j-k]=temp;
                }
            }else{
                for(int k = 0 ; k<(j-i+1)/2;k++){
                    temp = nums[i+k];
                    nums[i+k]=nums[j-k];
                    nums[j-k]=temp;
                }
            }
        }
        for(int t : nums){
            System.out.print(t+" ");
        }

    }
}

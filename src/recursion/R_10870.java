package recursion;

import java.io.*;

public class R_10870 {

    public static void main(String[] args) throws  Exception{
        // 재귀 사용
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int n = Integer.parseInt(br.readLine());
        int result = solution(n);
        System.out.println(result);
    }

    public static int solution(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;

        return solution(n-1) + solution(n-2);
    }
}

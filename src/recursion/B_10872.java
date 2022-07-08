package recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_10872 {
    public static void main(String[] args) throws Exception{
        //    0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
//        solution();

        // 재귀 사용
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int n = Integer.parseInt(br.readLine());
        int result = fac(n);
        System.out.println(result);
    }

    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter((System.out))));

        int n = Integer.parseInt(br.readLine());

        int answer = 1;
        for(int i=1; i < n + 1;i++){
            answer *= i;
        }
//        System.out.println("answer :: " + answer);
        bw.write(String.valueOf(answer));
        bw.flush();
    }

    public static int fac(int n) throws Exception{
        if(n == 1) return 1;
        else if(n ==0) return 1;
        return n * fac(n-1);
    }
}

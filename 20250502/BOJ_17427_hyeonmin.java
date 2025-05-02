import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 0.5초 주어짐 5000만번 계산가능
        // 100만일 때? 50만
        // 1부터 N까지 숫자의 모든 약수를 더한 값

        // 1의 배수는 항상 약수에 1을 포함 -> 1, 2, 3, ..., N : 약수 1이 N개
        // 2의 배수는 항상 약수에 2를 포함 -> 2, 4, 6, ..., N : 약수 2가 N/2개
        // 3의 배수는 항상 약수에 3을 포함 -> 3, 6, 9, ..., N : 약수 3이 N/3개
        // N의 배수는 항상 약수에 N을 포함 -> N               : 약수 N이 1개

        int N = Integer.parseInt(br.readLine());
        long sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += (i * (N/i));
        }

        System.out.println(sum);
    }

}

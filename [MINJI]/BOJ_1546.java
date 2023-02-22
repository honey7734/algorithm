import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_1546 {
    public static void main(String[] args) {
        // 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다.
        // 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
        // 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
        // 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
        // 첫째 줄에 시험 본 과목의 개수 N이 주어진다.
        // 이 값은 1000보다 작거나 같다.
        // 둘째 줄에 세준이의 현재 성적이 주어진다.
        // 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다

        // 1번째 값 / max값 * 100 + 2번째 값 / max값 * 100 .... i번째 값 / max값 * 100
        // 위의 값을 i롱 나눈값을 출력
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < a; i++) {
            arr.add(sc.nextInt());
        }

        float max = Collections.max(arr);
        float sum = 0;

        for(int i = 0; i < a; i++) {
            sum += (arr.get(i)/max)*100;
        }
        System.out.println(sum/a);
    }
}
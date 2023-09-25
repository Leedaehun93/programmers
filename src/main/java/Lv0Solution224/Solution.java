package Solution224;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : Solution224
 * fileName : Solution
 * author : L.DH
 * date : 2023-09-25
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class Solution {
//    /**
//     * TODO : 문자 리스트를 문자열로 변환하기
//     *
//     * @param arr ["a","b","c"]
//     * @return "abc"
//     */
//    public String solution1(String[] arr) {
//        String answer = ""; // 리턴값(내보내기 결과값)
//        for (int i = 0; i < arr.length; i++) {
//            answer = answer + arr[i]; // 배열의 값을 문자열 붙이기
//        }
//        return answer;
//    }

    /**
     * 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
     * 입출력 예
     * num	n	result
     * 98	2	1
     * 34	3	0
     * 입출력 예 #1
     * <p>
     * 98은 2의 배수이므로 1을 return합니다.
     * 입출력 예 #2
     * <p>
     * 32는 3의 배수가 아니므로 0을 return합니다.
     */
    public int solution(int num, int n) {
        int answer;
        if (num % n == 0) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }

    /**
     * 배열 만들기 1
     * 정수 n과 k가 주어졌을 때,
     * 1 이상 n이하의 정수 중에서
     * k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
     * 입출력 예
     * n   k   result
     * 10   3   [3, 6, 9]
     * 15   5   [5, 10, 15]
     *
     * @param n
     * @param k
     * @return
     */
//    public List<Integer> solution100(int n, int k) {
//        List<Integer> answer = new ArrayList<>();
//
////        k의 배수만 넣기 : add()
//        for (int i = 1; i <= n; i++) {
//            if (i % k == 0) {
////              i값 추적 : 로깅(디버깅의 기초)
////               i의 변하는 값을 화면에 결과 출력 : sout
////                System.out.println("[i] "+i); // i 의 값 추적
//                answer.add(i); // i k의 배수임
//            }
//        }
//
//        return answer;
//    }

}   // end of class

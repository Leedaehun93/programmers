package Lv0Solution224;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : Lv0Solution224
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
    /**
     * TODO : 문자열 출력하기
     * 입력 : HelloWorld!
     * 출력 : HelloWorld!
     */
//    public String solution1(String[] arr) {
//        String answer = ""; // 리턴값(내보내기 결과값)
//        for (int i = 0; i < arr.length; i++) {
//            answer = answer + arr[i]; // 배열의 값을 문자열 붙이기
//        }
//        return answer;
//    }

    /**
     * TODO : 배수
     */
//    public int solution(int num, int n, int m) {
//        int answer = num % n == 0 && num % m == 0 ? 1 : 0;
//        int answer;
//        if (num % n == 0 && num % m == 0) {
//            answer = 1;
//        } else {
//            answer = 0;
//        }
//        return answer;
//    }

    /**
     * TODO : 홀짝에 따라 다른 값 반환하기
     */
//    public int solution6(int n) {
//        if(n % 2 == 1)
//            return  (n+1)/2*((n + 1)/2) ;
//        else
//            return   n*(n+1)*(n+2)/6;
//    }

    /**
     * TODO : 배열 만들기 1
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

    /**
     * TODO : 조건 문자열
     */
//    public int solution7(String ineq, String eq, int n, int m) {
//        if (ineq.equals(">")) {
//            if (eq.equals("=")) {
//                return n >= m ? 1 : 0;
//            } else if (eq.equals("!")) {
//                return n > m ? 1 : 0;
//            }
//        } else if (ineq.equals("<")) {
//            if (eq.equals("=")) {
//                return n <= m ? 1 : 0;
//            } else if (eq.equals("!")) {
//                return 50 < 20 ? 1 : 0;
//            }
//        }
//        return 0; // 기본적으로 0을 반환 (조건에 맞지 않는 경우)
//    }


    /**
     * TODO : flag에 따라 다른 값 반환하기
     */
    public int solution8(int a, int b, boolean flag) {

        if (flag == true){
            return a + b;
        } else {
            return a - b;
        }
    } // 오늘은 여기까지

}   // end of class

package Lv0Solution224;

import java.util.List;
import java.util.Scanner;

/**
 * packageName : Lv0Solution224
 * fileName : SolutionApplication
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
public class SolutionApplication {
    public static void main(String[] args) {
        /**
         * TODO : 문자열 출력하기
         * 입력 : HelloWorld!
         * 출력 : HelloWorld!
         */
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//
//        if (a.length() >= 1 && a.length() <= 1000000 && !a.contains(" ")) {
//            System.out.println(a);
//        } else {
//            System.out.println("잘못 입력하였습니다.");
//        }
//        /**
//         * TODO : 문자 리스트를 문자열로 변환하기
//         * @param arr ["a","b","c"]
//         * @return  "abc"
//         */
//        Solution solution1 = new Solution();
//        String[] arg = {"a", "b", "c"}; // 배열 입력값
//
//        String answer = solution1.solution1(arg);
//
//        System.out.println(answer);

        /**
         * TODO : 배수
         */
//        Solution solution = new Solution();
//        int answer = solution.solution(60, 2, 3);
//        System.out.println(answer);

        /**
         * TODO : 홀짝에 따라 다른 값 반환하기
         * @param n
         * @return
         */
//        Solution solution6 = new Solution();
//        int answer = solution6.solution6(10);
//        System.out.println(answer);

        /**
         * 배열 만들기 1
         * 정수 n과 k가 주어졌을 때,
         * 1 이상 n이하의 정수 중에서
         * k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
         *  *입출력 예
         * n	k	result
         * 10	3	[3, 6, 9]
         * 15	5	[5, 10, 15]
         */
//        Solution solution100 = new Solution();
//        List<Integer> answer = solution100.solution100(10, 3);
//        System.out.println(answer);

        /**
         * TODO : 조건 문자열
         */
//        Solution solution7 = new Solution();
//        int answer = solution7.solution7("<", "!", 50, 20);
//        System.out.println(answer);

        /**
         * TODO : flag에 따라 다른 값 반환하기
         *  // 오늘은 여기까지
         */
        Solution solution8 = new Solution();
        int answer = solution8.solution8(-4, 7, false);
        System.out.println(answer);



    }   // end of main
}   // end of class
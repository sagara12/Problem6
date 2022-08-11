/*      괄호가 알맞게 짝지어진 가장 긴 부분의 길이를 구하시오. ‘(‘와 ‘)’로만 이루어진 문자열에서, 괄호
        가 알맞게 짝지어진 가장 긴 부분의 길이를 구한다. “(()”의 경우 가장 긴 유효한 부분은 “()” 이므로
        길이는 2 이다. “)()())”의 경우는, 가장 긴 유효한 부분은 “()()” 이므로 길이는 4 이다.

              Input: )()())
              result: 4
              Input: (()
              result: 2       */


import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        while(true) {
            System.out.println("값을 입력 하세요");
            Scanner intput = new Scanner(System.in);
            String string1 = intput.nextLine();
            char[] stringArrays = string1.toCharArray();
            int size = stringArrays.length;
            int count = 0;
            int sw = 0;
            int index = 0;
            int count2 = 0;
            for (int i = 0; i < size; i++) {
                char val = stringArrays[i];
                if (val == 40) {
                    sw = 1;
                } else {
                    sw = 0;
                }
                for (int j = i + 1; j < size; j++) {
                    char val2 = stringArrays[j];
                    if (sw == 1) {
                        if (val2 == 41) {
                            count++;
                            sw = 0;
                            index = j;
                        } else {

                            break;

                        }


                    } else {
                        if (val2 == 40) {
                            sw = 0;
                            index = j;
                        } else {

                            break;

                        }
                    }
                }
                count2 = Math.max(count2, count);
            }

            System.out.println("result : " + count2 * 2);
        }

    }
}
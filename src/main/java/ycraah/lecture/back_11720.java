package ycraah.lecture;

import java.util.Scanner;

public class back_11720 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //입력
    int inputNum = sc.nextInt(); //숫자의 개수
    sc.nextLine();
    String inputStr = sc.nextLine(); //N개의 숫자

    //합계 변수
    int total = 0;

    //String -> char -> int
    for(int i = 0; i < inputNum; i++) {
      total += inputStr.charAt(i) - '0';
    }

    System.out.println(total);

  }
}
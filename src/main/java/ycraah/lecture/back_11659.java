package ycraah.lecture;

import java.util.Scanner;

public class back_11659 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int dataNum = sc.nextInt();
    int Que = sc.nextInt();

    int[] arr = new int[dataNum];
    int[] Sarr = new int[dataNum];
    int result = 0;

    //합 배열 생성
    for(int i = 0; i < dataNum; i++){
      arr[i] = sc.nextInt();
      if(i == 0){
        Sarr[i] = arr[i];
      } else {
        Sarr[i] = Sarr[i-1] + arr[i];
      }
    } //end of for

    //구간 합 계산
    for(int i = 1; i <= Que; i++){
      int x = sc.nextInt()-1;
      int y = sc.nextInt()-1;

      if (x <= 0){
        result = Sarr[y];
      } else {
        result = Sarr[y] - Sarr[x-1];
      }

      System.out.println(result);
    } //end of for
  } //end of main
}

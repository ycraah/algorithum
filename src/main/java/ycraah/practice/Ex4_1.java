package ycraah.practice;

import java.util.Arrays;

public class Ex4_1 {
  public static void main(String[] args) {
    int[] score = {79,88,91,33,100,55,95};
    int min = score[0];
    int max = score[0];

    for(int i=0; i<score.length; i++){
      if(max < score[i]){
        max = score[i];
      } else if(min > score[i]){
        min = score[i];
      }
    }

    System.out.println("최소값: " + min);
    System.out.println("최대값: " + max);
  }
}

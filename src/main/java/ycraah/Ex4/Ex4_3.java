package ycraah.Ex4;

import java.util.Arrays;

public class Ex4_3 {
  public static void main(String[] args) {
    int[] numArr = {0,1,2,3,4,5,6,7,8,9};
    int tmp = 0;

    for(int i = 1; i <= 100; i++){
      for(int y = 0; y <numArr.length; y++){
        tmp = numArr[y];
        int random = (int)(Math.random() * numArr.length);
        numArr[y] = numArr[random];
        numArr[random] = tmp;
      }
    }
    System.out.println(Arrays.toString(numArr));
  }
}

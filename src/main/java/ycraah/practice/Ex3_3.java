package ycraah.practice;

public class Ex3_3 {
  public static void main(String[] args) {
    int total = 0;
    for(int i = 1; i <= 20; i++){
      if(i % 2 != 0 && i % 3 != 0){
        total += i;
      }
    }
    System.out.println(total);
  }
}

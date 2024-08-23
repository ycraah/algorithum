package ycraah.Ex3;

public class Ex3_4 {
  public static void main(String[] args) {
    String str = "12345";
    int total = 0;
    for(int i = 0; i < str.length(); i++) {
      total += str.charAt(i) - '0';
    }
    System.out.println("결과 : " + total);
  }
}

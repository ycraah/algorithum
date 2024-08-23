package ycraah.Ex3;

import java.util.Scanner;

public class Ex3_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalMoney = 0;
    while(true){
      System.out.println("""
          ------------------------------------
          1.예금 | 2. 출금 | 3. 잔고 | 4. 종료
          ------------------------------------
          """);
      System.out.print("선택>");
      String cmd = sc.nextLine();

      if(cmd.equals("1")){
        System.out.print("예금액>");
        int inputNum1 = sc.nextInt();
        totalMoney += inputNum1;
      } else if(cmd.equals("2")){
        System.out.print("출금액>");
        int inputNum2 = sc.nextInt();
        totalMoney -= inputNum2;
      } else if(cmd.equals("3")){
        System.out.println("잔고>" + totalMoney);
      } else if(cmd.equals("4")){
        System.out.println("프로그램 종료");
        break;
      }
      }
    }
  }


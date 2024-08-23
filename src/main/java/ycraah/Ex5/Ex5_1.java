package ycraah.Ex5;

public class Ex5_1 {
  public static void main(String[] args) {
    Student s = new Student("홍길동", 1, 1, 100, 60 , 76);

    String str = s.info();
    System.out.println(str);
  }

}

class Student{
  String name;
  int ban, no, kor, eng, math;
  int sum;
  float aver;

  public Student(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.sum = kor + eng + math;
    this.aver = (Math.round(sum*10/3f))/10f;
  }

  public Student(){

  }

  String info(){
    return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + sum + "," + aver;
  }

  int getTotal(){
    return kor + eng + math;
  }

  float getAverage(){
    return (Math.round((kor + eng + math)*10/3f))/10f;
  }
}
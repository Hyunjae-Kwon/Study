package Day013.test.Teacher;

import java.util.Scanner;

public class RandomSum {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("난수의 개수를 입력하세요");
      int count = sc.nextInt();
      
      int sum = 0;
      for(int i=0;i<count;i++) {
         sum += (int)(Math.random()*45+1);
         System.out.print(sum + ", ");
      }
      sc.close();
      System.out.println();
      System.out.println("\n난수의 개수 : " + count);
      System.out.println("1~45 사이의 난수 " + count + "개의 합계 : " + sum);
   }
}
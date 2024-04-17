package util;

import java.util.Scanner;

//역할: 스캐너 입력을 간소화해주는 객체
public class SimpleInput {

    //문자열 입력을 처리
     Scanner sc = new Scanner(System.in);

   public String input(String message){
        System.out.print(message);
        return sc.nextLine();
    }

   public void stopInput(){
        System.out.println("\n===========엔터를 누르면 계속...==============");
       sc.nextLine();
    }
}

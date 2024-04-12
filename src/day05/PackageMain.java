package day05;

//다른 패키지에 있는 클래스에 로딩할 때 이름을 축약해서 쓰기위해 사용

//import DAY05.juice.Apple;
//import DAY05.juice.Banana;
//import DAY05.juice.Peach;
import day05.juice.*;

import java.util.Scanner;

public class PackageMain {
    public static void main(String[] args) {

        day05.fruit.Apple a1 = new day05.fruit.Apple();
        day05.juice.Apple a2 = new day05.juice.Apple();
        new Banana();
        new Peach();

        Scanner scanner = new Scanner(System.in);


    }
}

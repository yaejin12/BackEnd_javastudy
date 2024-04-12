package day04;

public class DogMain {
    int x =20; // 필드이다

    public static void main(String[] args) {

        int a =10; // 전역변수이다 // main이라는 함수에 있어서

       Dog choco = new Dog("초코");
       Dog poppy = new Dog("뽀삐잉");
        System.out.println("choco = " + choco);
        System.out.println("poppy = " + poppy);

       choco.petInfo();
        System.out.println("==========================");
        poppy.inject();
        poppy.petInfo();


    }
}

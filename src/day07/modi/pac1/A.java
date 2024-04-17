package day07.modi.pac1;

public class A {

    //필드
    public int f1; //접근제한자
    int f2; //default 라는 제한이 걸린거다
    private int f3;


    //메서드
    public void m1(){}
    void m2(){}//default 라는 제한이 걸린거다
    private void m3(){}

    //생성자
   public   A(int a){}
    A(double b){}
    private A(boolean c){}

    void test(){
        //같은 클래스 안에서는 제한자가 뭘 붙든지 상관없다
        this.f1 =10;
        this.f2 =10;
        this.f3 =10;

        m1();m2();m3();

        new A(10);
        new A(5.5);
        new A(false);
    }



}

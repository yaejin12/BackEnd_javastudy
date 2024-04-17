package day07.modi.pac1;
//class에는 public, default만 붙일 수 있다

class B {

    public int z1;
    int z2;
    private int z3;


    void test(){

        A a1 = new A(50); //public : 어디는 사용 가능
        A a2 = new A(5.5); //default : 다른 패키지는 불가능
        //A a3 = new A(true);//private 제한접근자로 되어있기 때문애

        a1.f1 =20; //public
        a1.f2 = 50; //default
        //a1.f3 = 500;//private

        a1.m1();//public
        a1.m2();//
        //a1.m3();////private : 같은 반 친구들만 사용 가능하다




    }


}

package day01;

public class DataType {
    public static void main(String[] args) {
        //전부 정수를 넣는 변수
        //1byte === 8bit
        //1bit ===숫자 0이나 1을 저장할 수 있음
       byte a = 127; //1byte
       short b = 32767; //2byte
       int c =2147483647; //4byte
       long d =214748364744444L; //8byte // int보다 더 높은 값을 넣으려면 L을 붙이면 된다

        float e =3.14F; //float는 소수점 뒤에 F를 붙여야한다
        double f = 2.14;
        double g = 100; // 정수 저장이 가능하긴 해
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //true &false 논리 저장 
        boolean flag1 = false;
        boolean flag2 = 10 > 5;  // 10이 5보다 크냐? true 나와야할때 boolean을 적어야한다


        int x = 200;
        System.out.println(x +a);
        System.out.println(b * x);
        
        //문자형 char : 2byte
        char text = 'a'; // 문자형 char는 한글자만 가능
        System.out.println("text = " + text);

        //문자열 : 문자 배열의 줄인 말
        //안녕하세요는 사실은 배열이었던 것 ['안','녕','하','세','요'];
        char[]hello = {'안','녕','하','세','요'};
        System.out.println("hello ="+ new String(hello));
        String hello2 = "안녕하세요";
        
        
        
       
    }
}

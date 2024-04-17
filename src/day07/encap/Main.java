package day07.encap;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("제네시스");


        myCar.startStop();
        //이런 문제점이 있을 수 있다.
        //myCar.start = false; 프라이빗이기 때문에 건드릴 수 없다

        //속도 0~200km로만 제한
        myCar.setSpeed(66);

        System.out.println("현재 속도: "+ myCar.getSpeed() + "km/h");

        //변속모드
        myCar.setMode('X');
        System.out.println("현재 변속모드:"+myCar.getMode());

    }
}

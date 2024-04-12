package day05;

public class ListMain {
    public static void main(String[] args) {
        StringList foods = new StringList(); //StringList은 객체이고 그 안에 배열이 있다
        StringList userNames = new StringList();

        //배열 내부 데이터 수 확인
        System.out.println(foods.size());
        System.out.println(userNames.size());

        // 배열에 추가
        foods.push("짬뽕");
        foods.push("치킨");

        //자료삭제
        foods.remove("짬뽕");

        userNames.push("예진");

        //자료 중간 삽입
        userNames.push("문지은");
        userNames.insert(1,"뽀로로");
        foods.insert(0,"마라탕");
        foods.insert(1,"족발");

        //배열 데이터 수정
        foods.set(0,"김치볶음밥"); //0번 인덱스가 수정되어야함

        //배열 데이터 전체 삭제
        foods.clear(); //foods 배열 내부가 전체삭제되고 size 가 0이 되어야한다

        //배열 데이터가 한개라도 있는지
       boolean flag = foods.isEmpty(); // 배열이 비어있으면 true, 아니면 false

        System.out.println("foods = " + foods.toString());
        System.out.println("userNames = " + userNames.toString());
    }
}

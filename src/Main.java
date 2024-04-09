import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(10+5);
        System.out.println("안뇽"); //문자는 무조건 "" 쌍따음표로 표시

        int month = 5;
        int day = 5;
        String anni = "어린이 날";

        System.out.println(month + "월" + day + "일은" + anni + "입니다");
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
        //command d -> 복사됨
        //command x -> 한줄 삭제됨



    }
}
package day07.encap.practice;

public class Student {

    //필드
    private String name;//이름
    private String studentId; //학번
    private String department;//학과


    //메서드


    //생성자

    //get

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }



    //set

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            System.out.println("입력하렴");
        }else {
        this.name = name;}
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

package day07.encap.practice;

public class PasswordManager {
    //필드
    private String password;


    //생성자
    PasswordManager(String password){
        this.password = password;
    }



    //메서드
    public boolean changePassword(String oldPassword, String newPassword){
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
           return true;
        } else {return false;}
    }




}

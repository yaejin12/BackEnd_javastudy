package day07.encap.practice;

public class Car {

    //필드
   private String brand;//브랜드
    private String model;
   private int year;

    //생성자
    Car(){

    }

    //메서드


    //get


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    //set

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
       if(year < 2024) {
           this.year = year;
       } else {
           System.out.println("니 차 내 꺼 ");
       }
    }
}

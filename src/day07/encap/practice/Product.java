package day07.encap.practice;

public class Product {
    //필드
    private String name;
    private int price;
    private int stock;//재고감소


    //get
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }


    //set

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reduceStock(int i) {
        if(i <0 || i < this.stock){
            this.stock -= i;
        } else {
            System.out.println("앙돼!");
        }
    }


    //메서드



}

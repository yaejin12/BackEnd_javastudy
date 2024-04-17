package day05.player;

public class Main {
    public static void main(String[] args) {

        Player parking = new Player("주차왕");
        Player insultKing = new Player("욕설왕");

        System.out.println("parking = " + parking);
        System.out.println("insultKing = " + insultKing);

        parking.attack(insultKing);
        parking.attack(insultKing);

        Player p1 = new Player();
        Player p2 = new Player("",0,0);

        new Player("하하");



    }
}

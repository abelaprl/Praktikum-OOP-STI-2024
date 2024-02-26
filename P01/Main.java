package Praktikum.prak1.p1;

import java.util.*;

public class Main {
   public static void main(String[] args) {
    HideNSeek m1 = new HideNSeek("ara", 5);

    System.out.println("ada berapa pemain? " + m1.getPlayer());
    System.out.println("siapa seeker? " + m1.getSeeker());
    System.out.println("berapa player ditemukan" + m1.getPlayerFound());
    m1.foundPlayer();
    System.out.println("jadi berapa " + m1.getPlayerFound());
    System.out.println("sisa pemain " + m1.getPlayer());

    CarDealer mb = new CarDealer("volvo", 4, 23000);

    System.out.println("brand apa? " + mb.getBrand());
    System.out.println("berapa mobil di dealer? " + mb.getCarInDealer());
    System.out.println("harga? " + mb.getCarPrice());
    System.out.println("total mobil? " + mb.getTotalCar());
    mb.sellCar(2);
    System.out.println("sisa? " + mb.getCarInDealer());
     System.out.println("profit? " + mb.getProfit());

    CarDealer md = new CarDealer("volvo", 4, 23000);

    System.out.println("brand apa? " + md.getBrand());
    System.out.println("berapa mobil di dealer? " + md.getCarInDealer());
    System.out.println("harga? " + md.getCarPrice());
    System.out.println("total mobil? " + md.getTotalCar());
    md.sellCar(2);
    System.out.println("sisa di dealer? " + md.getCarInDealer());
    System.out.println("sisa di total ? " + md.getTotalCar());
     System.out.println("profit? " + md.getProfit());

     

}
}

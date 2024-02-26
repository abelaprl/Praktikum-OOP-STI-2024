package Praktikum.prak1.p1;
import java.util.*;

public class CarDealer {
    private static int totalCar = 0;
    private String brand;
    private int carInDealer;
    private int carPrice;
    private int profit = 0;

    /**
     * CarDealer constructor
     * Inisiasi sekaligus menambah totalCar
     * @param brand
     * @param carInDealer
     * @param carPrice
     */
    public CarDealer(String brand, int carInDealer, int carPrice) {
        this.brand = brand;
        this.carInDealer = carInDealer;
        this.carPrice = carPrice;
        totalCar+= this.carInDealer;
    }

    /**
     * getBrand
     * @return brand
     */
    public String getBrand() {
        return this.brand;
        
    }

    /**
     * getCarInDealer
     * @return carInDealer
     */
    public int getCarInDealer() {
        return this.carInDealer;
        
    }
    
    /**
     * getCarPrice
     * @return carPrice
     */
    public int getCarPrice() {
        return this.carPrice;
        
    }

    /**
     * getProfit
     * @return profit
     */
    public int getProfit() {
        return this.profit ;
        
    }

    /**
     * getTotalCar
     * @return totalCar
     */
    public static int getTotalCar() {
        return totalCar;
        
    }

    /**
     * sellCar
     * yang terjual 
     * @param amount
     * @return void
     */
    public void sellCar(int amount) {
        if(this.carInDealer >=amount  && amount >0){ // salah disini, harus lebih teliti lagi ga cuman mastiin car dealer ga 0
            this.carInDealer-= amount; 
            this.totalCar -= amount;
            this.profit = carPrice*amount;
    }
}
}
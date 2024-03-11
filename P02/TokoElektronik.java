// package Praktikum.prak2;

import java.util.Scanner;

public class TokoElektronik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int jml = Integer.parseInt(sc.nextLine());
        int total_price = 0;
        
        while(jml != 0){
            int jenis = Integer.parseInt(sc.nextLine());
            
            if(jenis == 1){
                String brand = sc.nextLine();
                String model = sc.nextLine();
                int storageCapacity = Integer.parseInt(sc.nextLine());
                int batteryLife = Integer.parseInt(sc.nextLine());

                Smartphone hp = new Smartphone(brand, model, storageCapacity, batteryLife);
                hp.displayDetails();
                int price = hp.calculatePrice();
                System.out.println("Price: " + price);
                total_price += price;
            }
            
            else if(jenis == 2){
                String brand = sc.nextLine();
                String model = sc.nextLine();
                String processortType = sc.nextLine();
                int ram = Integer.parseInt(sc.nextLine());
                int isTouchScreen= Integer.parseInt(sc.nextLine());
                Laptop lp;
                if(isTouchScreen == 1){
                    lp = new Laptop(brand, model, processortType, ram, true);
                }
                else{
                    lp = new Laptop(brand, model, processortType, ram, false);
                }
                lp.displayDetails();
                int price = lp.calculatePrice();
                System.out.println("Price: " + price);
                total_price += price;                
            }   
            
            else if(jenis == 3){

                String brand = sc.nextLine();
                String model = sc.nextLine();
                int screenSize = Integer.parseInt(sc.nextLine());
                int hasCellular = Integer.parseInt(sc.nextLine());

                Tablet t ;
                if(hasCellular == 1){
                    t = new Tablet(brand, model, screenSize, true);
                }
                else{
                    t = new Tablet(brand, model, screenSize, false);
                }
                t.displayDetails();
                int price = t.calculatePrice();
                System.out.println("Price: " + price);
                total_price += price ;
            }
        
            jml--;
        }
        System.out.println("Total price: " + total_price);
       sc.close();
    }
}


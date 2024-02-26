//package Praktikum.prak1.p1;
import java.util.*;

public class GameSimulator {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int jml = Integer.parseInt(sc.nextLine());
        String namaSeeker = sc.nextLine();
        System.out.println("Game dimulai dengan " + jml + " pemain, seeker adalah " + namaSeeker );
        
        HideNSeek game = new HideNSeek(namaSeeker, jml);
        
        while( game.getPlayerFound() != jml-1 ){
            int ditemukan = Integer.parseInt(sc.nextLine());

            if(ditemukan == game.getPlayerFound()+1){
                game.foundPlayer();
                System.out.println( game.getPlayerFound() + " Pemain ditemukan");
            }
            
            
        }
        System.out.println("Semua pemain telah ditemukan, permainan selesai.");
        
        sc.close();

    }
}

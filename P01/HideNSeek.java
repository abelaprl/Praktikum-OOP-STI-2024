package Praktikum.prak1.p1;
import java.util.*;


public class HideNSeek {
    private String seeker;
    private int player;
    private int playerFound = 0;

    /**
    * HideNSeek constructor
    * @param seeker
    * @param player
    * /
    */
    public HideNSeek(String seeker, int player) {
        this.seeker = seeker;
        this.player = player;
    
    }

    /**
     * getSeeker
     * @return seeker
     */
    public String getSeeker() {
        return this.seeker;

    }

    /**
     * getPlayer
     * @return player
     */
    public int getPlayer() {
        return this.player;
 }

    /**
     * getPlayerFound
     * @return playerFound
     */
    public int getPlayerFound() {
        return this.playerFound;
        
    }

    /**
     * Menambahkan playerFound sebanyak 1
     * dengan syarat masih ada player yang belum ditemukan
     * @return void
     */
    public void foundPlayer() {
        if(this.getPlayer() != 0){
            this.playerFound += 1;
            this.player -= 1;
        }

        /* atau
         if(this.playerFound != this.player) this.playerFound++
         */
        
    }
}

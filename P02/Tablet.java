// package Praktikum.prak2;

public class Tablet extends StoreItem {
    private int screenSize;
    private boolean hasCellular;

    /**
     * Tablet constructor
     * @param brand
     * @param model
     * @param screenSize
     * @param hasCellular
     */
    public Tablet(String brand, String model, int screenSize, boolean hasCellular) {
        super(brand, model);
        this.screenSize = screenSize;
        this.hasCellular = hasCellular;

    }
    
    /**
     * Mencetak tambahan detail sebuah barang dengan format seperti berikut (tanpa [])
     * Cetak brand dan model dengan metode displayDetails dari class StoreItem
     * Screen size: [Ukuran layar dengan satuan inches]
     * Has cellular: [Apabila hasCellular, maka cetak Yes, selain itu No]
     */
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Screen size: " + screenSize +" inches");
        if(hasCellular) System.out.println("Has cellular: Yes");
        else System.out.println("Has cellular: No");

    }

    /**
     * Menghitung harga dari tablet
     * Apabila nama brand "Legowo", maka rumus: 300 + (Ukuran layar * 5) + (Jika has cellular, tambahkan 50)
     * Selain nama brand "Legowo", rumus: 300 + (Ukuran layar * 15) + (Jika has cellular, tambahkan 150)
     */
    @Override
    public int calculatePrice() {
        int price = 300;
        if(getBrand()=="Legowo"){
            if(hasCellular){
                price +=  (screenSize * 5) + 50;
            }
            else{
                price += (screenSize * 5 );
            }
        }
        else{
            if(hasCellular){
                price += (screenSize * 15) + 150;
            }
            else{
                price += (screenSize * 15 );
            }
        }
        return price;

    }
}

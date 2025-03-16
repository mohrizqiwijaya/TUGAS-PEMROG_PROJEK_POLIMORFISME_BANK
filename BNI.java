/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransaksiBank;

/**
 *
 * @author USER90
 */
public class BNI extends Bank {

    public BNI(String bank_bni) {
    }

    

   public void sukuBunga() {
        System.out.println("Suku Bunga dari BCA adalah 4.5%");
    }

  
   public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer sebesar Rp" + jumlah + " ke rekening " + rekeningTujuan + " di bank BCA");
    }
}
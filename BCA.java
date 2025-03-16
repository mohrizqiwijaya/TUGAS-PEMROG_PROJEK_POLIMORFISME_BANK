package TransaksiBank;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER90
 */
public class BCA extends Bank {

    public BCA(String bank_BCA) {
    }

   

    @Override
    public void SukuBunga() {
        System.out.println("Suku Bunga Dari Bank BCA Adalah 4.5%");
    }

    @Override
   public void TransferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer Rp Sebesar" + jumlah + "Tujuan Bank Yang Akan DiTransfer" + rekeningTujuan + " Bank Tujuan Adalah Bank BCA");
    }
}

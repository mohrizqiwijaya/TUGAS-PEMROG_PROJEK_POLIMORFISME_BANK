/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransaksiBank;

/**
 *
 * @author USER90
 */
public class BankMain {
    public static void main(String[] args){
        
        
        Bank BankUmum = new Bank();
        BankUmum.TransferUang(20000, "7854745454");
        BankUmum.TransferUang(100000, "9872546612", "BCA");
        BankUmum.TransferUang(200000, "58412142541", "BNI", "Bukti Pembayaran invoice");
        
        BankUmum.SukuBunga();
        
        BCA bca = new BCA("Bank BCA");
        BNI bni = new BNI("Bank BNI");
        
        bca.SukuBunga();
        bni.SukuBunga();
        
        bca.TransferUang(1000000, "9872546612", "BNI");
        bni.TransferUang(5000000, "58412142541", "BCA");
        
    }
    
    
}

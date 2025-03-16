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
        BankUmum.TransferUang(10000, "9876543210");
        BankUmum.TransferUang(50000, "3698521470", "BCA");
        BankUmum.TransferUang(100000, "7894561230", "BNI", "Bukti Pembayaran invoice");
        
        BankUmum.SukuBunga();
        
        BCA bca = new BCA("Bank BCA");
        BNI bni = new BNI("Bank bni");
        
        bca.SukuBunga();
        bni.SukuBunga();
        
        bca.TransferUang(600000, "3654789120", "BNI");
        bni.TransferUang(700000, "4561235741", "BCA");
        
    }
    
    
}

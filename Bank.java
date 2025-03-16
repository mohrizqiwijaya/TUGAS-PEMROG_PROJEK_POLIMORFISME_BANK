/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransaksiBank;

/**
 *
 * @author USER90
 */
public class Bank {

    public void TransferUang(int jumlah, String RekeningTujuan){
        System.out.println("Transfer Rp Sebesar" + jumlah + "Tujuan Bank Yang Akan DiTransfer" + RekeningTujuan);
    }
    
    public void TransferUang(int jumlah, String RekeningTujuan, String BankTujuan){
        System.out.println("Transfer Rp Sebesar" + jumlah + "Tujuan Bank Yang Akan DiTransfer" + RekeningTujuan + "ke Bank Yang Akan Dituju" + BankTujuan);
    }
    
    public void TransferUang(int jumlah, String RekeningTujuan, String BankTujuan, String Berita){
        System.out.println("Transfer Rp Sebesar" + jumlah + "Tujuan Bank Yang Akan DiTransfer" + RekeningTujuan + "ke Bank Yang Akan Dituju" + BankTujuan + "Berita Bank" + Berita);
    }
    
    public void SukuBunga(){
        System.out.println("Suku Bunga Yang Standard Adalah 3%");
    }
}

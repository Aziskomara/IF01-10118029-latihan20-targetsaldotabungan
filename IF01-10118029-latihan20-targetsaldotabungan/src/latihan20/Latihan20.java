/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan20;

/**
 *
 * @author acer
 * NAMA      : Azis komara
 * KELAS     : IF-1
 * NIM       : 10118029
 * Deskripsi Program   : Program ini berisi program target saldo tabungan
 */
public class Latihan20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int saldo;
        int bunga;
        saldo = 3500000;
        for(int i = 1; i <= 12; i++){
            bunga = saldo * 8/100;
            saldo = bunga + saldo;
            if(saldo <= 6500000){
                System.out.println("Saldo di buan ke-"+ i +"Rp."+saldo);
            }
        }
    }
    
}

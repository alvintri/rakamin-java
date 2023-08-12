package firstProgram;

public class operator {
    public static void main(String[] args){
        //Operator
        //Define variable
        int x = 12;
        int y = 5;

        //Define operator
        int hasilPenjumlahan = x + y;
        int hasilPerkalian = x * y;
        boolean apakahSama = (x == y);
        boolean apakahLebihBesar = (x>y);

        //Print Penjumlahan
        System.out.println("Hasil Penjumlahan : " + hasilPenjumlahan);
        System.out.println("Hasil Perkalian : " + hasilPerkalian);
        System.out.println("Apakah x sama dengan y? " + apakahSama);
        System.out.println("Apakah x lebih besar dari y? " + apakahLebihBesar);
    }
}

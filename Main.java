import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obx = new Scanner(System.in);
        Pegawai pegawai1 = new Pegawai();
        
        //Menggunakkan default konstruktor
         System.out.println("Masukkan informasi Pegawai 1:");
         System.out.print("Nama: ");
         pegawai1.setNama(obx.nextLine());
         System.out.print("Jabatan: ");
         pegawai1.setJabatan(obx.nextLine());
         System.out.print("Gaji Pokok: ");
         pegawai1.setgajiPokok(obx.nextDouble());
         System.out.print("Tunjangan: ");
         pegawai1.setTunjangan(obx.nextDouble());
         System.out.print("Potongan: ");
         pegawai1.setPotongan(obx.nextDouble());
         System.out.print("Bonus: ");
         pegawai1.setBonus(obx.nextDouble());
         
        
         System.out.println("\nInformasi Pegawai 1 setelah diatur:");
         pegawai1.displayInfo();

      
        System.out.print("Masukkan bonus tambahan untuk Pegawai 1: ");
        double bonusTambahan = obx.nextDouble();
        pegawai1.tambahBonus(bonusTambahan);
        System.out.println("\nInformasi Pegawai 1 setelah menambah bonus:");
        pegawai1.displayInfo();

         //Menggunakan overloading konstruktor
         System.out.println("\nMasukkan informasi Pegawai 2:");
         obx.nextLine(); 
         System.out.print("Nama: ");
         String namaPegawai2 = obx.nextLine();
         System.out.print("Jabatan: ");
         String jabatanPegawai2 = obx.nextLine();
         System.out.print("Gaji Pokok: ");
         double gajiPokokPegawai2 = obx.nextDouble();
         System.out.print("Tunjangan: ");
         double tunjanganPegawai2 = obx.nextDouble();
         System.out.print("Potongan: ");
         double potonganPegawai2 = obx.nextDouble();
         System.out.print("Bonus: ");
         double bonusPegawai2 = obx.nextDouble();
 
         Pegawai pegawai2 = new Pegawai(namaPegawai2, jabatanPegawai2, gajiPokokPegawai2, tunjanganPegawai2, potonganPegawai2, bonusPegawai2);
         
        
         System.out.println("\nInformasi Pegawai 2:");
         pegawai2.displayInfo();
 
         
         System.out.print("Masukkan bonus tambahan untuk Pegawai 2: ");
         double bonusTambahan2 = obx.nextDouble();
         pegawai2.tambahBonus(bonusTambahan2);
         System.out.println("\nInformasi Pegawai 2 setelah menambah bonus:");
         pegawai2.displayInfo();
 
         
         obx.close();
 
    }
    
}

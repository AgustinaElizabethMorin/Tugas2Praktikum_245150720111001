import java.text.DecimalFormat;
public class Pegawai{
    private String Nama;
    private String Jabatan;
    private double gajiPokok;
    private double Tunjangan;
    private double Potongan;
    private double Bonus;
   
    public Pegawai(){ //Default Constructor
        this.Nama = " ";
        this.Jabatan = "";
        this.gajiPokok = 0.0;
        this.Tunjangan = 0.0;
        this.Potongan = 0.0;
        this.Bonus = 0.0;
    }
    // Overloading Constructor
    public Pegawai (String Nama, String Jabatan, double gajiPokok, double Tunjangan, double Potongan, double Bonus ){
        this.Nama = Nama;
        this.Jabatan = Jabatan;
        this.gajiPokok = gajiPokok;
        this.Tunjangan = Tunjangan;
        this.Potongan = Potongan;
        this.Bonus = Bonus;
    }
    public double hitungGajiTotal (){
        return gajiPokok + Tunjangan + Bonus - Potongan;
    }
    public void displayInfo() {
        DecimalFormat df = new DecimalFormat("#,###.00"); 
        System.out.println("====================================");
        System.out.println("            GAJI PEGAWAI       ");
        System.out.println("====================================");
        System.out.printf("%-15s : %s%n", "Nama", Nama);
        System.out.printf("%-15s : %s%n", "Jabatan", Jabatan);
        System.out.printf("%-15s : %s%n", "Gaji Pokok", df.format(gajiPokok));
        System.out.printf("%-15s : %s%n", "Tunjangan", df.format(Tunjangan));
        System.out.printf("%-15s : %s%n", "Potongan", df.format(Potongan));
        System.out.printf("%-15s : %s%n", "Bonus", df.format(Bonus));
        System.out.printf("%-15s : %s%n", "Total Gaji", df.format(hitungGajiTotal()));
        System.out.println("====================================");
    }
    public void tambahBonus(double tambahBonus){
        this.Bonus += tambahBonus;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setJabatan(String Jabatan){
        this.Jabatan = Jabatan;
    }
    public void setgajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    public void setTunjangan(double Tunjangan){
        this.Tunjangan = Tunjangan;
    }
    public void setPotongan(double Potongan){
        this.Potongan = Potongan;
    }
    public void setBonus(double Bonus){
        this.Bonus = Bonus;
    }

}

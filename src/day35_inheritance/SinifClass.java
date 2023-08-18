package day35_inheritance;

public class SinifClass extends  OkulClass{
    String sinif="11-F";
    String telefon="3125676789";
   public SinifClass(String telefon){
        System.out.println("Sınıf constructure çaılıştı.");
        System.out.println(telefon);
        System.out.println(this.telefon);
        System.out.println(super.telefon);
    }

    public static void main(String[] args) {
        SinifClass obj=new SinifClass("3127658798");
    }
}

package day_40_inheritance_exaples;

public class Sinif extends Okul{
    Sinif(int a){
        super();
        System.out.println("Sınıf Parametreli Constructor'u çalıştı");

    }
    Sinif(){
        this(5);
        System.out.println("Sinif parametresiz constructor u çalıştı");

    }

    public static void main(String[] args) {
        Sinif sinif=new Sinif();

    }
}

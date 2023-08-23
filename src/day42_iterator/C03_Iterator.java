package day42_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(1);
        ListIterator lit=sayilar.listIterator();
        System.out.println(sayilar);
        while (lit.hasNext()){
            lit.set((Integer)lit.next()+2);

        }
        System.out.println(sayilar);


    }
}

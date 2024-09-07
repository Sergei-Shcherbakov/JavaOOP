package seminar.sem3;

//Создайте несколько экземпляров Pharmacy, причем, чтобы среди них было хотя бы два экземпляра
//с полностью идентичными значениями полей.
//
//Сделать так, чтобы после выполнения кода ниже, в сете result были только уникальные объекты.
//Set<Pharmacy> result = new HashSet<>(множество из нескольких лекарств);
//System.out.println(result.size()); // тут вывод должен быть равен количеству УНИКАЛЬНЫХ экземпляров Pharmacy!
//
//Добавить интерфейс Copmparable<Pharmacy> к классу Pharmacy. Переопределить метод compareTo()
//подсказка: можно добавить, а можно не добавлять в класс поля;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PharmacyComponent azitronit = new Azitronit("Azitrinit", "10 Mg", 50);
        PharmacyComponent azitronit1 = new Azitronit("Azitrinit", "10 Mg", 50);
        PharmacyComponent azitronit2= new Azitronit("Azitrinit", "10 Mg", 50);
        PharmacyComponent water = new Water("Water", "10 Mg", 120);
        PharmacyComponent pinicilin = new Pinicilin("Pinicilin", "10 Mg", 20);
        PharmacyComponent pinicilin2 = new Pinicilin("Pinicilin", "10 Mg", 20);

//        List<PharmacyComponent> pharmacyComponents = new ArrayList<>();
//        pharmacyComponents.add(azitronit);
//        pharmacyComponents.add(water);
//        pharmacyComponents.add(pinicilin);
//        pharmacyComponents.add(pinicilin2);
//
//        System.out.println(pharmacyComponents);
//        Collections.sort(pharmacyComponents);
//        System.out.println(pharmacyComponents);


        Pharmacy pharmacy1 = new Pharmacy(1).addComponent(azitronit).addComponent(water);
        Pharmacy pharmacy2 = new Pharmacy(2).addComponent(water).addComponent(pinicilin);
        Pharmacy pharmacy3 = new Pharmacy(3).addComponent(water).addComponent(pinicilin);
        Pharmacy pharmacy4 = new Pharmacy(4).addComponent(azitronit1).addComponent(pinicilin2);
        Pharmacy pharmacy5 = new Pharmacy(5).addComponent(azitronit1).addComponent(pinicilin2);
        Pharmacy pharmacy6 = new Pharmacy(6).addComponent(azitronit1).addComponent(pinicilin2);

        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);
        result.add(pharmacy5);
        result.add(pharmacy6);


        System.out.println(result.size());
        System.out.println(result);
        System.out.println("--------------------------------------");

        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(pharmacy3);
        pharmacyList.add(pharmacy1);
        pharmacyList.add(pharmacy2);
        pharmacyList.add(pharmacy6);
        pharmacyList.add(pharmacy4);
        pharmacyList.add(pharmacy5);


        System.out.println(pharmacyList);
        Collections.sort(pharmacyList);
        System.out.println(pharmacyList);


//        for (PharmacyComponent component: pharmacy1){
//            System.out.println(component.getName());
//        }
//
//        List<Pharmacy> pharmacyList = new ArrayList<>();
//        pharmacyList.add(pharmacy1);
//        pharmacyList.add(pharmacy2);

//        Collections.sort(pharmacyList);

//        Iterator<PharmacyComponent> iterator = pharmacy1;

//        while (((Iterator<PharmacyComponent>) pharmacy1).hasNext()) {
//            System.out.println(((Iterator<PharmacyComponent>) pharmacy1).next());
//        }

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }



    }
}

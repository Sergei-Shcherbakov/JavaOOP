package seminar.sem3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PharmacyComponent azitronit = new Azitronit("Azitrinit", "10 Mg", 50);
        PharmacyComponent azitronit1 = new Azitronit("Azitrinit", "10 Mg", 50);
        PharmacyComponent azitronit2= new Azitronit("Azitrinit", "10 Mg", 50);
        PharmacyComponent water = new Water("Water", "10 Mg", 120);
        PharmacyComponent pinicilin = new Pinicilin("Pinicilin", "10 Mg", 20);
        PharmacyComponent pinicilin2 = new Pinicilin("Pinicilin", "10 Mg", 20);

        List<PharmacyComponent> pharmacyComponents = new ArrayList<>();
        pharmacyComponents.add(azitronit);
        pharmacyComponents.add(water);
        pharmacyComponents.add(pinicilin);
        pharmacyComponents.add(pinicilin2);

        System.out.println(pharmacyComponents);
        Collections.sort(pharmacyComponents);
        System.out.println(pharmacyComponents);


        Pharmacy pharmacy1 = new Pharmacy().addComponent(azitronit).addComponent(water);
        Pharmacy pharmacy2 = new Pharmacy().addComponent(water).addComponent(pinicilin);

        for (PharmacyComponent component: pharmacy1){
            System.out.println(component.getName());
        }

        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(pharmacy1);
        pharmacyList.add(pharmacy2);

//        Collections.sort(pharmacyList);

//        Iterator<PharmacyComponent> iterator = pharmacy1;

//        while (((Iterator<PharmacyComponent>) pharmacy1).hasNext()) {
//            System.out.println(((Iterator<PharmacyComponent>) pharmacy1).next());
//        }

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Set<PharmacyComponent> set = new HashSet<>();
        set.add(azitronit);
        set.add(azitronit1);
        set.add(azitronit2);
        System.out.println(set);

    }
}

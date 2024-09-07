package seminar.sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// Лекарство
public class Pharmacy implements Iterable<PharmacyComponent>, Comparable<Pharmacy>{
    private List<PharmacyComponent> components = new ArrayList<>();
    private int index = 0;



    public List<PharmacyComponent> getComponents() {
        return components;
    }

    public void setComponents(List<PharmacyComponent> components) {
        this.components = components;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Pharmacy addComponent(PharmacyComponent component){
        components.add(component);
        return this;
    }

//    @Override
//    public boolean hasNext() {
//        return index < components.size();
//    }
//
//    @Override
//    public PharmacyComponent next() {
//        return components.get(index++);
//    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + index +
                '}';
    }

    @Override
    public Iterator<PharmacyComponent> iterator() {
        return new IteratorComponent(this);
    }

    @Override
    public int compareTo(Pharmacy o) {
        return 0;
    }




//    @Override
//    public Iterator<PharmacyComponent> iterator() {
//        return new Iterator<PharmacyComponent>() {
//            @Override
//            public boolean hasNext() {
//                return index < components.size();
//            }
//
//            @Override
//            public PharmacyComponent next() {
//                return components.get(index++);
//            }
//        };
//    }
}

package seminar.sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

// Лекарство
public class Pharmacy implements Iterable<PharmacyComponent>, Comparable<Pharmacy>{
    private List<PharmacyComponent> components = new ArrayList<>();
    private int index = 0;
    private int id = 0;

    public Pharmacy(int id) {
        this.id = id;
    }

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
                "components=" + components + ", id = " + id +
                '}';
    }

    @Override
    public Iterator<PharmacyComponent> iterator() {
        return new IteratorComponent(this);
    }

    @Override
    public int compareTo(Pharmacy o) {
        if (this.id > o.id) return 1;
        else if (this.id < o.id) return -1;
        else return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return index == pharmacy.index && Objects.equals(components, pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components, index);
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

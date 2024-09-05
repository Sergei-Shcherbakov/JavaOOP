package homework.dz2;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable, Speakble{
    public Dog() {
        super();
    }

    public Dog(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double run() {
        return 15;
    }

    @Override
    public double getRunSpeed() {
        return 15;
    }

    @Override
    public void speak() {
        System.out.println("woof-woof");
    }

    @Override
    public double swimSpeed() {
        return 3;
    }
}

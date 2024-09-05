package homework.dz2;

import java.time.LocalDate;

public class Cat extends Animal implements Speakble, Goable {
    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void speak() {
        System.out.println("meow");
    }

    @Override
    public double run() {
        return 10;
    }

    @Override
    public double getRunSpeed() {
        return 5.5;
    }


}


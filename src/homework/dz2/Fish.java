package homework.dz2;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable {
    public Fish() {
    }

    public Fish(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double swimSpeed() {
        return 5;
    }
}


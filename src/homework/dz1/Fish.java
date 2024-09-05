package homework.dz1;

import java.time.LocalDate;

public class Fish extends Animal  {
    public Fish() {
    }

    public Fish(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
}

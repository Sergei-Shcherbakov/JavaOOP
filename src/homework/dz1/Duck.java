package homework.dz1;

import java.time.LocalDate;

public class Duck extends Animal{
    public Duck() {
    }

    public Duck(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
}

package homework.dz2;

import java.time.LocalDate;

public class Duck extends Animal implements Goable, Swimable, Speakble, Flyable{
    public Duck() {
    }

    public Duck(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double flyFlyable() {
        return 10;
    }

    @Override
    public double run() {
        return 2;
    }

    @Override
    public double getRunSpeed() {
        return 0;
    }

    @Override
    public void speak() {

    }

    @Override
    public double swimSpeed() {
        return 0;
    }
}
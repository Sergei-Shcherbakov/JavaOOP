package homework.dz1;

import java.time.LocalDate;

public class Animal {
    private String name;
    private Illness illness;
    private String ownerName;
    private LocalDate birthday;

    public Animal() {
    }

    public Animal(String name, Illness illness, String ownerName, LocalDate birthday) {
        this.name = name;
        this.illness = illness;
        this.ownerName = ownerName;
        this.birthday = birthday;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Illness getIllness() {
        return illness;
    }

    private void wakeUp(){
        System.out.println(getClass().getSimpleName() + " woke up");
    }
    private void wakeUp(String time){
        System.out.println(getClass().getSimpleName() + " woke up in " + time);
    }

    private void eat(){
        System.out.println(getClass().getSimpleName() + " eat");
    }

    private void play(){
        System.out.println(getClass().getSimpleName() + " plays");
    }
    private void sleep(){
        System.out.println(getClass().getSimpleName() + " go to bed");
    }

    public void liveCycle(){
        wakeUp();
        eat();
        play();
        sleep();
    }

    public  void breathe(){
        System.out.println("breathe");
    }

}

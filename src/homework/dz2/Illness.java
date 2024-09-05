package homework.dz2;

public class Illness {
    public String illnessName;

    public Illness(String illnessName) {
        this.illnessName = illnessName;
    }

    public void heal(){
        System.out.println("drink water");
    }

    @Override
    public String toString() {
        return illnessName;
    }
}

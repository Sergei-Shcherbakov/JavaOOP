package homework.dz2;

public class Nurse extends Worker{

    public Nurse(String workerName) {
        super(workerName);
        this.post = "nurse";
    }

    @Override
    void workObligation() {
        System.out.println(getClass().getSimpleName() + " gives injections");

    }
}

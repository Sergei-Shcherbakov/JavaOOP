package homework.dz2;

public class Doctor extends Worker{

    public Doctor(String workerName) {
        super(workerName);
        this.post = "doctor";
    }



    @Override
    void workObligation() {
        System.out.println(getClass().getSimpleName() + " writes a diagnosis");
    }
}

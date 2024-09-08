package lessons.les5.task1;

public class Sumer {

    private int value;

    public Sumer(int value) {
        this.value = value;


    }

    public int getValue() {
        return value;
    }

    public Sumer sumerNumber(Sumer value) {

        return new Sumer(this.value + value.getValue());
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
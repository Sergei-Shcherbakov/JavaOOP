package homework.dz2;

public abstract class Worker {
    protected String post;
    private String workerName;


    public Worker(String workerName) {
        this.workerName = workerName;
    }

    public String getPost(){
        return post;
    };

    public String getWorkerName() {
        return workerName;
    }


    abstract void workObligation();

    @Override
    public String toString() {
        return "Worker{" +
                "post='" + post + '\'' +
                ", workerName='" + workerName + '\'' +
                '}';
    }
}


package homework.dz2;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();
    private List<Worker> workers = new ArrayList<>();

    public List<Animal> getPatients() {
        return patients;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public List<Animal> addPatient(Animal patient){
        patients.add(patient);
        return patients;
    }

    public List<Worker> addWorker(Worker worker){
        workers.add(worker);
        return workers;
    }
    public void removePatient(Animal patient){
        patients.remove(patient);
    }
    public void removeWorker(Worker worker){
        workers.remove(worker);
    }

    public List<Goable> getGoable(){
        List<Goable> result = new ArrayList<>();
        for (Animal animal: patients){
            if (animal instanceof Goable){
                result.add((Goable) animal);
            }
        }
        return result;
    }
   public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal animal: patients){
            if (animal instanceof Flyable){
                result.add((Flyable) animal);
            }
        }
        return result;
    }
   public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal animal: patients){
            if (animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;
    }
   public List<Speakble> getSpeakble(){
        List<Speakble> result = new ArrayList<>();
        for (Animal animal: patients){
            if (animal instanceof Speakble){
                result.add((Speakble) animal);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        if (workers.isEmpty()){
            return "VeterinaryClinic{" + "patients=" + patients + '}';
        }
        else if (patients.isEmpty()) {
            return "VeterinaryClinic{" + "workers=" + workers + '}';
        }
         else {
            return "VeterinaryClinic{" +
                    "patients=" + patients +
                    ", workers=" + workers +
                    '}';
        }
    }
}

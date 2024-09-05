package homework.dz2;
//Создать класс Doctor и подумать над его состоянием и поведением. Создать класс Nurse(медсестра) и подумать над его состоянием и поведением.
//
//Создайте интерфейсы Goable, Flyable, Swimable. У интерфейсов должны быть
//методы получения скорости заданного действия.
//
//Добавьте наследников этим интерфейсам, но таким образом,
//чтобы у каждого интерфейса было минимум по два наследника (при необходимости, добавьте в приложение новые классы)
//
//Создать класс ВетеринарнаяКлиника (VeterinaryClinic)
//У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих, всех говорящих и всех летающих, а также методы для работы с персоналом клиники.
//
//Формат сдачи: ссылка на гитхаб

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Duck duck = new Duck();
        Doctor doctor = new Doctor("Nill");
        Nurse nurse = new Nurse("Anna");

        System.out.println(doctor.getWorkerName());
        doctor.workObligation();
        nurse.workObligation();

        VeterinaryClinic patients = new VeterinaryClinic();
        patients.addPatient(cat);
        System.out.println(patients);

        VeterinaryClinic workers = new VeterinaryClinic();
        workers.addWorker(doctor);
        workers.addWorker(nurse);

        System.out.println(fish.swimSpeed());

        System.out.println(workers);

        System.out.println(patients.getSpeakble());


    }
}

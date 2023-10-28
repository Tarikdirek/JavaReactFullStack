package carModel;

import carModel.business.concretes.CarManager;
import carModel.dataAccess.concretes.HibernateCarDao;
import carModel.entities.concretes.Car;

public class Main {
    public static void main(String[] args) {
        Car ford = new Car(1,"Mustang",2017,"Blue",2000000);

        Car honda = new Car(2,"Civic",2019,"White",1000000);

        CarManager carManager = new CarManager(new HibernateCarDao());

        carManager.add(honda);
        carManager.delete(honda);
        carManager.update(honda);
    }
}
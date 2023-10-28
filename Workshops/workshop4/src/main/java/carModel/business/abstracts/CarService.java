package carModel.business.abstracts;

import carModel.entities.concretes.Car;

public interface CarService {
    void add(Car car);
    void update (Car car);
    void  delete (Car car);
}

package carModel.dataAccess.abstracts;

import carModel.entities.concretes.Car;

public interface CarDao {

    void add(Car car);
    void delete(Car car);
    void update(Car car);
}

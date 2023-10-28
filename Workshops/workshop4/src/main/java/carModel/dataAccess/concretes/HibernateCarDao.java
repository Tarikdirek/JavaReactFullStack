package carModel.dataAccess.concretes;

import carModel.dataAccess.abstracts.CarDao;
import carModel.entities.concretes.Car;

public class HibernateCarDao implements CarDao {

    @Override
    public void add(Car car) {
        System.out.println(car.getModelName() + " hibernate ile veritabanına kaydedildi");
    }

    @Override
    public void delete(Car car) {
        System.out.println(car.getModelName() + " hibernate ile veritabanından silindi");
    }

    @Override
    public void update(Car car) {
        System.out.println(car.getModelName() + " hibernate ile güncellendi");
    }
}

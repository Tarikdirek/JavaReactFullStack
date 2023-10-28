package carModel.dataAccess.concretes;

import carModel.dataAccess.abstracts.CarDao;
import carModel.entities.concretes.Car;

public class JdbsCarDao implements CarDao {

    @Override
    public void add(Car car) {
        System.out.println(car + " JDBS ile veritabanına kaydedildi");
    }

    @Override
    public void delete(Car car) {
        System.out.println(car + " JDBS ile veritabanından silindi");
    }

    @Override
    public void update(Car car) {
        System.out.println(car + " JDBS ile güncellendi");
    }
}

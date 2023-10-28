package carModel.business.concretes;

import carModel.business.abstracts.CarService;
import carModel.dataAccess.abstracts.CarDao;
import carModel.entities.concretes.Car;

public class CarManager implements CarService {

    private CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }


    @Override
    public void add(Car car) {
        if ((car.getModelYear() > 2018) && (car.getUnitPrice() >500000) ) {
            carDao.add(car);
        }else {
            System.out.println("Araç bilgilerini kontrol edip sisteme uygun bir şekilde giriniz");
        }
    }

    @Override
    public void update(Car car) {

        carDao.update(car);
    }

    @Override
    public void delete(Car car) {
        if (!(car.getColor().matches("White"))) {
            carDao.delete(car);
        }else {
            System.out.println("Bu renkteki bir arabayı silemezsiniz");
        }
    }
}

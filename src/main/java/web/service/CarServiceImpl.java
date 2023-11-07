package web.service;

import web.model.Car;
import web.dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("carServiceImpl")
public class CarServiceImpl implements CarService{
 public final CarDao carDao;
    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }


    @Override
    public List<Car> getSpecifiedNumberOfCars(int number) {
        return carDao.getSpecifiedNumberOfCars(number);
    }

    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }
}

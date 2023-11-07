package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getSpecifiedNumberOfCars(int number);
    void addCar(Car car);
}

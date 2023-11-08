package web.dao;
import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImp implements CarDao {
    private final List<Car> carList = new ArrayList<>();

    public CarDaoImp() {
        carList.add(new Car("Mercedes-Benz E-Class AMG 63 AMG S V (W213)", "Germany", 70000));
        carList.add(new Car("Li9", "China", 5));
        carList.add(new Car("golf - car", "United Kingdom", 9000));
        carList.add(new Car("Belaz", "Belarus", 150000));
        carList.add(new Car("Gazel", "Russia", 30000));
    }


    @Override
    public List<Car> getAllCars() {
        return carList;
    }
}

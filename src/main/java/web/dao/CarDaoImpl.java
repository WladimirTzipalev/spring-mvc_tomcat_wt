package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car ("Chevrolet", "Cruze", 2013));
        cars.add(new Car ("Toyota", "Camry", 2012));
        cars.add(new Car ("Dodge", "Journey", 2013));
        cars.add(new Car ("Skoda", "Octavia", 2010));
        cars.add(new Car ("Kia", "Sorento", 2019));
    }

    @Override
    public List<Car> getCountCars(Integer count) {
        return cars.subList(0, count);
    }
    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}

package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    CarDao carDao = new CarDaoImpl();
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car ("Chevrolet", "Cruze", 2013));
        cars.add(new Car ("Toyota", "Camry", 2012));
        cars.add(new Car ("Dodge", "Journey", 2013));
        cars.add(new Car ("Skoda", "Octavia", 2010));
        cars.add(new Car ("Kia", "Sorento", 2019));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count != null && count < 5 && count > 0) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }
}

package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private final List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car("Bmw", "black", 1));
        carsList.add(new Car("Volkswagen", "grey", 2));
        carsList.add(new Car("Mercedes", "white", 3));
        carsList.add(new Car("Opel", "blue", 4));
        carsList.add(new Car("Audi", "gold", 5));
    }


    @Override
    public List<Car> getListCar() {
        return new ArrayList<>(carsList);
    }

}

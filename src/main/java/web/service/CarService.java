package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getListCar();

    List<Car> getNewLengthCarList(int count);

}


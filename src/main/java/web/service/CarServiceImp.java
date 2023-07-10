
package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarServiceImp implements CarService {
    private final CarDao carDao;

    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getListCar() {
        return carDao.getListCar();
    }

    @Override
    public List<Car> getNewLengthCarList(int count) {
        if (count == 5) {
            getListCar();
        }
        return getListCar().stream().limit(count).collect(Collectors.toList());
    }

}
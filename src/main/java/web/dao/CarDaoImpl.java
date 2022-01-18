package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Lada 2109", "малиновый", 1993, 150_000));
        carList.add(new Car("Volvo cx70", "черный", 2010, 900_000));
        carList.add(new Car("Kia Rio", "белый", 2015, 1_000_000));
        carList.add(new Car("Lada Vesta", "желтый", 2020, 1_300_000));
        carList.add(new Car("Volkswagen Tiguan", "синий", 2010, 960_000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}

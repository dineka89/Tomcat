package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Mers", "black", 2000));
        carList.add(new Car("audi", "yellow", 2010));
        carList.add(new Car("lex", "white", 2012));
        carList.add(new Car("bmw", "blue", 2015));
        carList.add(new Car("kia", "grey", 2020));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}

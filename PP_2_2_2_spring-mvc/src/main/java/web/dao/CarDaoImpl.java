package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> getCarList = new ArrayList<>();

    static {
        getCarList.add(new Car("KIA", "white", "17k54"));
        getCarList.add(new Car("Nissan", "blue", "25p91"));
        getCarList.add(new Car("Toyota", "red", "64t11"));
        getCarList.add(new Car("BMW", "black", "25y77"));
        getCarList.add(new Car("Honda", "grey", "25y79"));
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count == 0) {
            return getCarList;
        }
        return getCarList.stream().limit(count).collect(Collectors.toList());
    }
}

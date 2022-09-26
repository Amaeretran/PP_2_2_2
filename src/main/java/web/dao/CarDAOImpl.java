package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {
    @Override
    public List<Car> refreshTable(String count, List<String> messages) {
        int intCount;
        List<Car> cars = getCars();
        if (count != null) {
            try {
                intCount = Math.max(Integer.parseInt(count), 0);
            } catch (Exception e) {
                messages.add("!!! Value must be a natural number !!!");
                intCount = 0;
            }
            if (intCount < cars.size()) {
                for (int i = cars.size() - intCount; i > 0; i--) {
                    cars.remove(cars.size() - 1);
                }
            }
        }
        return cars;
    }

    private List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "RS6", 600));
        cars.add(new Car("BMW", "M3 Competition", 510));
        cars.add(new Car("Mercedes", "AMG GT", 639));
        cars.add(new Car("Mazda", "MX-5", 160));
        cars.add(new Car("Tesla", "Model S 'Plaid'", 1020));
        return cars;
    }
}

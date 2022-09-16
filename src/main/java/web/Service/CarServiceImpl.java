package web.Service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> refreshTable(List<Car> cars, String count, List<String> messages) {
        int intCount;
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
}

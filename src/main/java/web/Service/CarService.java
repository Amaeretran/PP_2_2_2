package web.Service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> refreshTable(List<Car> cars, String count, List<String> messages);
}

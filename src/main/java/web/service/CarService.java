package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> refreshTable(String count, List<String> messages);
}

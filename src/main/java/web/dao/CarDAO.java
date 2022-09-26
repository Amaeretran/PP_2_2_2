package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    List<Car> refreshTable(String count, List<String> messages);
}

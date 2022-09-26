package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    CarDAO carDAO;
    @Override
    public List<Car> refreshTable(String count, List<String> messages) {
        return carDAO.refreshTable(count, messages);
    }
}

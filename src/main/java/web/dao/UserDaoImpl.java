package web.dao;

import com.mysql.cj.xdevapi.SessionFactory;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {


//    private final EntityManager entityManager;
//    private final SessionFactory sessionFactory;

    @Override
    public List<User> refreshTable(String count, List<String> messages) {
        int intCount;
        List<User> users = getUsers();
        if (count != null) {
            try {
                intCount = Math.max(Integer.parseInt(count), 0);
            } catch (Exception e) {
                messages.add("!!! Value must be a natural number !!!");
                intCount = 0;
            }
            if (intCount < users.size()) {
                for (int i = users.size() - intCount; i > 0; i--) {
                    users.remove(users.size() - 1);
                }
            }
        }
        return users;
    }

    private List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Audi", "RS6", 600));
        users.add(new User("BMW", "M3 Competition", 510));
        users.add(new User("Mercedes", "AMG GT", 639));
        users.add(new User("Mazda", "MX-5", 160));
        users.add(new User("Tesla", "Model S 'Plaid'", 1020));
        return users;
    }
}

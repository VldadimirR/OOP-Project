package service;

import java.util.List;
import dto.User;

public interface UserService<U extends User> {

    U createUser(U user);

    U findById(Integer id);

    U findByFio(String lastName);

    boolean removeByFio(String lastName);

    boolean removeByGroupNumberAndAge(int age, int groupNumber);

    void sortUsersByName(List<U> users);
}

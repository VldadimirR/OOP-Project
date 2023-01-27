package repository;

import java.util.Collection;

import dto.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {

    E findByFio(String fio);

    boolean removeByFio(String fio);

    boolean removeByGroupNumberAndAge(int age, int groupNumber);

    Collection<E> findAll();
}


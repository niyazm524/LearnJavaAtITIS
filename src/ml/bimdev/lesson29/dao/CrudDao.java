package ml.bimdev.lesson29.dao;

public interface CrudDao<T> {
    // create
    void save(T model);

    //read
    T find(Long id);

    // update
    void update(T model);

    // delete
    void delete(Long id);
}

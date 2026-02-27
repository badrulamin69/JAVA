
package bos.service;


public interface DaoService<E>{
    
    void save(E e);
    void update(E e);
    E findAll(int id);
    void delete(int id);
}

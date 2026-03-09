
package pos.service;

import java.util.List;

public interface DaoService<E>{
    
    void save(E e);
    List<E> showAll();
    void update(E e);
    void delete(int id);
    
}

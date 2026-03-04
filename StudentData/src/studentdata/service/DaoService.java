
package studentdata.service;

import java.util.List;

public interface DaoService<E> {
    
    public void save(E e);
    public void update(E e);
    public void delete(int id);
    
    List<E> FindAllList();
      
}

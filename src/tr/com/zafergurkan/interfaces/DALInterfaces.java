package tr.com.zafergurkan.interfaces;

import java.util.List;

public interface DALInterfaces<T> {
     void Insert(T entity);
     List<T> GetAll();
     T Delete(T entity);
     void Update(T entity);
     List<T> GetByID(int id);
}

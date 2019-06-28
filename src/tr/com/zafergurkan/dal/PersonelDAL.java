package tr.com.zafergurkan.dal;

import tr.com.zafergurkan.core.ObjectHelper;
import tr.com.zafergurkan.interfaces.DALInterfaces;

import java.util.List;

public class PersonelDAL<PersonelContract> extends ObjectHelper implements DALInterfaces<PersonelContract> {
    @Override
    public void Insert(PersonelContract entity) {

    }

    @Override
    public List<PersonelContract> GetAll() {
        return null;
    }

    @Override
    public PersonelContract Delete(PersonelContract entity) {
        return null;
    }

    @Override
    public void Update(PersonelContract entity) {

    }

    @Override
    public List<PersonelContract> GetByID(int id) {
        return null;
    }
}

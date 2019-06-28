package tr.com.zafergurkan.dal;

import tr.com.zafergurkan.core.ObjectHelper;
import tr.com.zafergurkan.interfaces.DALInterfaces;

import java.util.List;

public class MusteriDAL<MusteriContract> extends ObjectHelper implements DALInterfaces<MusteriContract> {
    @Override
    public void Insert(MusteriContract entity) {

    }

    @Override
    public List<MusteriContract> GetAll() {
        return null;
    }

    @Override
    public MusteriContract Delete(MusteriContract entity) {
        return null;
    }

    @Override
    public void Update(MusteriContract entity) {

    }

    @Override
    public List<MusteriContract> GetByID(int id) {
        return null;
    }
}

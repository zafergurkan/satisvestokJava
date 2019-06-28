package tr.com.zafergurkan.dal;

import tr.com.zafergurkan.core.ObjectHelper;
import tr.com.zafergurkan.interfaces.DALInterfaces;

import java.util.List;

public class StokDAL<StokContract> extends ObjectHelper implements DALInterfaces<StokContract> {
    @Override
    public void Insert(StokContract entity) {

    }

    @Override
    public List<StokContract> GetAll() {
        return null;
    }

    @Override
    public StokContract Delete(StokContract entity) {
        return null;
    }

    @Override
    public void Update(StokContract entity) {

    }

    @Override
    public List<StokContract> GetByID(int id) {
        return null;
    }
}

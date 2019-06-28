package tr.com.zafergurkan.dal;

import tr.com.zafergurkan.core.ObjectHelper;
import tr.com.zafergurkan.interfaces.DALInterfaces;

import java.util.List;

public class SatisDAL<SatisContract> extends ObjectHelper implements DALInterfaces<SatisContract> {
    @Override
    public void Insert(SatisContract entity) {
        
    }

    @Override
    public List<SatisContract> GetAll() {
        return null;
    }

    @Override
    public SatisContract Delete(SatisContract entity) {
        return null;
    }

    @Override
    public void Update(SatisContract entity) {

    }

    @Override
    public List<SatisContract> GetByID(int id) {
        return null;
    }
}

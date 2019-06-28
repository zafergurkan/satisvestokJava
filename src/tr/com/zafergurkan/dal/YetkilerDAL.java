package tr.com.zafergurkan.dal;

import tr.com.zafergurkan.core.ObjectHelper;
import tr.com.zafergurkan.interfaces.DALInterfaces;
import tr.com.zafergurkan.types.YetkilerContract;

import java.util.List;

public class YetkilerDAL<YetkilerContract> extends ObjectHelper implements DALInterfaces<YetkilerContract> {
    @Override
    public void Insert(YetkilerContract entity) {

    }

    @Override
    public List<YetkilerContract> GetAll() {
        return null;
    }

    @Override
    public YetkilerContract Delete(YetkilerContract entity) {
        return null;
    }

    @Override
    public void Update(YetkilerContract entity) {

    }

    @Override
    public List<YetkilerContract> GetByID(int id) {
        return null;
    }
}

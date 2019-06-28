package tr.com.zafergurkan.dal;

import tr.com.zafergurkan.core.ObjectHelper;
import tr.com.zafergurkan.interfaces.DALInterfaces;
import tr.com.zafergurkan.types.KategoriContract;

import java.util.List;

public class KategoriDAL<KategoriContract> extends ObjectHelper implements DALInterfaces<KategoriContract> {


    @Override
    public void Insert(KategoriContract entity) {

    }

    @Override
    public List<KategoriContract> GetAll() {
        return null;
    }

    @Override
    public KategoriContract Delete(KategoriContract entity) {
        return null;
    }

    @Override
    public void Update(KategoriContract entity) {

    }

    @Override
    public List<KategoriContract> GetByID(int id) {
        return null;
    }
}

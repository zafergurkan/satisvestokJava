package tr.com.zafergurkan.dal;

import tr.com.zafergurkan.core.ObjectHelper;
import tr.com.zafergurkan.interfaces.DALInterfaces;

import java.util.List;

public class UrunlerDAL<UrunlerContact> extends ObjectHelper implements DALInterfaces<UrunlerContact> {
    @Override
    public void Insert(UrunlerContact entity) {

    }

    @Override
    public List<UrunlerContact> GetAll() {
        return null;
    }

    @Override
    public UrunlerContact Delete(UrunlerContact entity) {
        return null;
    }

    @Override
    public void Update(UrunlerContact entity) {

    }

    @Override
    public List<UrunlerContact> GetByID(int id) {
        return null;
    }
}

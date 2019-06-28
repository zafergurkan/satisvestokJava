package tr.com.zafergurkan.dal;

import tr.com.zafergurkan.core.ObjectHelper;
import tr.com.zafergurkan.interfaces.DALInterfaces;

import java.util.List;

public class AccountDAL<AccountContract> extends ObjectHelper implements DALInterfaces<AccountContract> {
    @Override
    public void Insert(AccountContract entity) {

    }

    @Override
    public List<AccountContract> GetAll() {
        return null;
    }

    @Override
    public AccountContract Delete(AccountContract entity) {
        return null;
    }

    @Override
    public void Update(AccountContract entity) {

    }

    @Override
    public List<AccountContract> GetByID(int id) {
        return null;
    }
}

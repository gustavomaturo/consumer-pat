package br.com.alelo.consumerpat.dataprovider.dao;

import br.com.alelo.consumerpat.core.dataprovider.dao.ContactDao;
import br.com.alelo.consumerpat.core.dataprovider.entity.ContactEntity;
import br.com.alelo.consumerpat.dataprovider.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDaoImpl implements ContactDao {

    @Autowired
    private ContactRepository repository;

    @Override
    public ContactEntity save(ContactEntity entity) {
        return this.repository.save(entity);
    }
}
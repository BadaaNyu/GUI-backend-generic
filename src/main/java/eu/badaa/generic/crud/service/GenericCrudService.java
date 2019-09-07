package eu.badaa.generic.crud.service;

import com.google.common.collect.Lists;
import eu.badaa.catbook.crud.exception.MainCatException;
import eu.badaa.generic.crud.dao.GenericCrudRepository;
import eu.badaa.generic.crud.model.GenericModel;

import java.util.List;

public abstract class GenericCrudService<V extends GenericModel, K> {

    public abstract GenericCrudRepository<V, K> getRepository();

    public List<V> getAllValues() {
        return Lists.newArrayList(getRepository().findAll());
    }

    public V createOrSaveValue(V value) {
        return getRepository().save(value);
    }

    public V getValueById(K id) {
        if(getRepository().findById(id).isPresent()){
            return getRepository().findById(id).get();
        }else{
            throw new MainCatException();
        }
    }

    public void deleteValue(K id) {
        getRepository().deleteById(id);
    }

}

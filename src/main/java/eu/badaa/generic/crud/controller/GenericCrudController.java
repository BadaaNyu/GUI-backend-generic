package eu.badaa.generic.crud.controller;

import com.google.common.collect.Lists;
import eu.badaa.generic.crud.model.GenericModel;
import eu.badaa.generic.crud.service.GenericCrudService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
public abstract class GenericCrudController<V extends GenericModel, K> {

    public abstract GenericCrudService<V, K> getService();

    @CrossOrigin
    @GetMapping
    public List<V> getAllValues() {
        return Lists.newArrayList(getService().getAllValues());
    }

    @CrossOrigin
    @PostMapping
    public V createOrSaveValue(@RequestBody V value) {
        return getService().createOrSaveValue(value);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public V getValueById(@PathVariable K id) {
        return getService().getValueById(id);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public void deleteValue(@PathVariable K id) {
        getService().deleteValue(id);
    }

}

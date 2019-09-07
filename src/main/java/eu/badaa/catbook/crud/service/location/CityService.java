package eu.badaa.catbook.crud.service.location;

import eu.badaa.catbook.crud.dao.location.CityDao;
import eu.badaa.catbook.crud.model.location.City;
import eu.badaa.generic.crud.service.GenericCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService extends GenericCrudService<City,String> {

    @Autowired
    private CityDao cityDao;

    @Override
    public CityDao getRepository() {
        return cityDao;
    }
}

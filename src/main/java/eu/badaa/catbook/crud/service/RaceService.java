package eu.badaa.catbook.crud.service;

import eu.badaa.catbook.crud.dao.RaceDao;
import eu.badaa.catbook.crud.model.Race;
import eu.badaa.generic.crud.service.GenericCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RaceService extends GenericCrudService<Race,String> {

    @Autowired
    private RaceDao raceDao;

    @Override
    public RaceDao getRepository() {
        return raceDao;
    }

}

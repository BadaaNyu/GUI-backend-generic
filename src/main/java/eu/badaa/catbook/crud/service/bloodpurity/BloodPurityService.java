package eu.badaa.catbook.crud.service.bloodpurity;

import eu.badaa.catbook.crud.dao.bloodpurity.BloodPurityDao;
import eu.badaa.catbook.crud.model.bloodpurity.BloodPurity;
import eu.badaa.generic.crud.service.GenericCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BloodPurityService extends GenericCrudService<BloodPurity,String> {

    @Autowired
    private BloodPurityDao bloodPurityDao;

    @Override
    public BloodPurityDao getRepository() {
        return bloodPurityDao;
    }

}

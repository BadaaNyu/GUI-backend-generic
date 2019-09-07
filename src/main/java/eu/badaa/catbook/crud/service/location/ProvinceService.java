package eu.badaa.catbook.crud.service.location;

import eu.badaa.catbook.crud.dao.location.ProvinceDao;
import eu.badaa.catbook.crud.model.location.Province;
import eu.badaa.generic.crud.service.GenericCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinceService extends GenericCrudService<Province,String> {

    @Autowired
    private ProvinceDao provinceDao;

    @Override
    public ProvinceDao getRepository() {
        return provinceDao;
    }

}

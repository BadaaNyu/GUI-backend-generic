package eu.badaa.catbook.crud.controller.location;

import eu.badaa.catbook.crud.model.location.Province;
import eu.badaa.catbook.crud.service.location.ProvinceService;
import eu.badaa.generic.crud.controller.GenericCrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProvinceController extends GenericCrudController<Province, String> {

    @Autowired
    private ProvinceService provinceService;

    @Override
    public ProvinceService getService() {
        return provinceService;
    }
}

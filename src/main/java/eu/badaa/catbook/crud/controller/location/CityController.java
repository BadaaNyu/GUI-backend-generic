package eu.badaa.catbook.crud.controller.location;

import eu.badaa.catbook.crud.model.location.City;
import eu.badaa.catbook.crud.service.location.CityService;
import eu.badaa.generic.crud.controller.GenericCrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController extends GenericCrudController<City, String> {

    @Autowired
    private CityService cityService;

    @Override
    public CityService getService() {
        return cityService;
    }
}

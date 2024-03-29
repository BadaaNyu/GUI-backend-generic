package eu.badaa.catbook.crud.controller.bloodpurity;

import eu.badaa.catbook.crud.model.bloodpurity.BloodPurity;
import eu.badaa.catbook.crud.service.bloodpurity.BloodPurityService;
import eu.badaa.generic.crud.controller.GenericCrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blood-purity")
public class BloodPurityController extends GenericCrudController<BloodPurity, String> {

    @Autowired
    private BloodPurityService bloodPurityService;

    @Override
    public BloodPurityService getService() {
        return bloodPurityService;
    }

}

package eu.badaa.catbook.crud.controller;

import eu.badaa.catbook.crud.model.Race;
import eu.badaa.catbook.crud.service.RaceService;
import eu.badaa.generic.crud.controller.GenericCrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/race")
public class RaceController extends GenericCrudController<Race, String> {

    @Autowired
    private RaceService raceService;

    @Override
    public RaceService getService() {
        return raceService;
    }
}

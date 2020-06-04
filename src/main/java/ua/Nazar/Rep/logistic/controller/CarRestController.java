package ua.Nazar.Rep.logistic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.Nazar.Rep.logistic.domain.Car;
import ua.Nazar.Rep.logistic.repo.CarRepo;

@RestController
@RequestMapping("/api/car")
public class CarRestController extends AbstractRestController<Car, CarRepo> {
    public CarRestController(CarRepo repo) {
        super(repo);
    }

}

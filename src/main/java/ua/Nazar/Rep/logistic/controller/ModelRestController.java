package ua.Nazar.Rep.logistic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.Nazar.Rep.logistic.domain.Model;
import ua.Nazar.Rep.logistic.repo.ModelRepo;

@RestController
@RequestMapping("/api/model")
public class ModelRestController extends AbstractRestController<Model, ModelRepo> {
    public ModelRestController(ModelRepo repo) {
        super(repo);
    }
}

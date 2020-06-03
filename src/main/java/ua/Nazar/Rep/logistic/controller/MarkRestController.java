package ua.Nazar.Rep.logistic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.Nazar.Rep.logistic.domain.Mark;
import ua.Nazar.Rep.logistic.repo.MarkRepo;

@RestController
@RequestMapping("/api/mark")
public class MarkRestController extends AbstractRestController<Mark, MarkRepo> {
    public MarkRestController(MarkRepo repo) {
        super(repo);
    }

}

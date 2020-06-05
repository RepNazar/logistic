package ua.Nazar.Rep.logistic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.Nazar.Rep.logistic.domain.Model;

public interface ModelRepo extends JpaRepository<Model, Long> {
}

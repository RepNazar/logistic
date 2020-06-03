package ua.Nazar.Rep.logistic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.Nazar.Rep.logistic.domain.Mark;

public interface MarkRepo extends JpaRepository<Mark, Long> {
}

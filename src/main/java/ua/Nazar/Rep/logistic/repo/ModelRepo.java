package ua.Nazar.Rep.logistic.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.Nazar.Rep.logistic.domain.Model;

public interface ModelRepo extends JpaRepository<Model, Long> {
    @Override
    @EntityGraph(attributePaths = {"mark"})
    Page<Model> findAll(Pageable pageable);
}

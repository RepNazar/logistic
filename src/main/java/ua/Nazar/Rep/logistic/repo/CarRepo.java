package ua.Nazar.Rep.logistic.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.Nazar.Rep.logistic.domain.Car;

public interface CarRepo extends JpaRepository<Car, Long> {
    @Override
    @EntityGraph(attributePaths = {"model.mark"})
    Page<Car> findAll(Pageable pageable);
}

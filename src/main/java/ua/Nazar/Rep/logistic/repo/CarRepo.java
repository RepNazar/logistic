package ua.Nazar.Rep.logistic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.Nazar.Rep.logistic.domain.Car;

public interface CarRepo extends JpaRepository<Car, Long> {
}

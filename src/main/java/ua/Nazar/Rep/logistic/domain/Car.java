package ua.Nazar.Rep.logistic.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Car {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}

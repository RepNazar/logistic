package ua.Nazar.Rep.logistic.domain;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Car implements ComboListItem {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    @JsonIdentityReference(alwaysAsId = true)
    private Model model;
}

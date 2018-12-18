package sec.project.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;


import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@AllArgsConstructor
@Data

public class Participant extends AbstractPersistable<Long> {

    private String name;
    private String address;
    @ManyToMany
    private List<Event> events;

    public Participant() {
        super();
    }

}

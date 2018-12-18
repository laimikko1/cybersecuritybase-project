package sec.project.domain;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@AllArgsConstructor
@Data
public class Comment extends AbstractPersistable<Long> {

    private String text;

    public Comment() {
        super();
    }
}
package sec.project.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@AllArgsConstructor
@Data

public class Event extends AbstractPersistable<Long> {

        private String name;
        private String date;
        @ManyToMany(mappedBy = "events")
        private List<Participant> participants;
        @OneToMany(fetch=FetchType.EAGER)
        @JoinColumn
        private List<Comment> comments;

        public Event() {
            super();
        }
    
}
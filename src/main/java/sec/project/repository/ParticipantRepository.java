package sec.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sec.project.domain.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}

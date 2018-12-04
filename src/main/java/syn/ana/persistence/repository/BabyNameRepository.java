package syn.ana.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import syn.ana.persistence.domain.BabyName; 

@Repository
public interface BabyNameRepository extends JpaRepository<BabyName, Long> {

}

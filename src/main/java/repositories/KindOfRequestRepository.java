package repositories;



import entities.KindOfRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KindOfRequestRepository extends JpaRepository<KindOfRequestEntity, Integer> {
     List<KindOfRequestEntity> findAll();
}

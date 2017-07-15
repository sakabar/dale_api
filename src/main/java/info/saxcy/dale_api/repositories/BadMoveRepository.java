package info.saxcy.dale_api.repositories;

import info.saxcy.dale_api.entities.BadMove;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sak on 2017/07/12.
 */

@Repository
public interface BadMoveRepository extends JpaRepository<BadMove, Long> {

  List<BadMove> findByKifId(String kif_id);
}

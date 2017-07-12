package info.saxcy.dale_api.repositories;

import info.saxcy.dale_api.models.BadMove;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sak on 2017/07/12.
 */
@Repository
// public interface BadMoveRepository extends JpaRepository<BadMove, Long> {
public interface BadMoveRepository extends CrudRepository<BadMove, Long> {

  List<BadMove> findByKifId(String kif_id);
}

package info.saxcy.dale_api.controllers;

import info.saxcy.dale_api.entities.BadMove;
import info.saxcy.dale_api.repositories.BadMoveRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sak on 2017/07/13.
 */
@RestController
@RequestMapping("/api/v1")
@EnableJpaRepositories("info.saxcy.dale_api.repositories")
public class DaleApiController {

  @Autowired
  BadMoveRepository repo;

  @GetMapping("/bad_moves")
  public List<BadMove> allBadMoves() {
    List<BadMove> ans = new ArrayList<BadMove>();

    for (BadMove bm : repo.findAll()) {
      ans.add(bm);
    }

    return ans;
  }

  @GetMapping("/bad_moves/{id}")
  public BadMove badMove(@PathVariable long id) {
    return repo.findById(id);
  }


}
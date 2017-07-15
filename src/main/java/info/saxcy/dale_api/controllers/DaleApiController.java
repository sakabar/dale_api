package info.saxcy.dale_api.controllers;

import info.saxcy.dale_api.entities.BadMove;
import info.saxcy.dale_api.repositories.BadMoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sak on 2017/07/13.
 */
@RestController
//@EnableJpaRepositories("info.saxcy.dale_api.repositories")
@EnableJpaRepositories("info.saxcy.dale_api.repositories")
public class DaleApiController {

  @Autowired
  BadMoveRepository repo;

  @RequestMapping("/")
  public String index() {
    int n = 0;
    for (BadMove bm : repo.findAll()) {
      n++;
    }

    return String.valueOf(n);
  }
}

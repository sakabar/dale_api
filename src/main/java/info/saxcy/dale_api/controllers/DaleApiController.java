package info.saxcy.dale_api.controllers;

import info.saxcy.dale_api.models.BadMove;
import info.saxcy.dale_api.repositories.BadMoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sak on 2017/07/13.
 */
@RestController
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

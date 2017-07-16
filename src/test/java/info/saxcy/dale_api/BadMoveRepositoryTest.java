package info.saxcy.dale_api;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import info.saxcy.dale_api.repositories.BadMoveRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by sak on 2017/07/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BadMoveRepositoryTest {

  //spring.datasource.driver-class-name=com.mysql.jdbc.Driver
  @Autowired
  BadMoveRepository repo;


  @Test
  public void findAllができる() {
    assertThat(repo.findAll().size(), is(7488));
  }


  @Test
  public void findByKifIdができる() {
    int actual = repo.findByKifId("20161101_0116").size();
    assertThat(actual, is(8));
  }


}

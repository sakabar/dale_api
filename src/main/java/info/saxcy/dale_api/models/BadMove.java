package info.saxcy.dale_api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by sak on 2017/07/12.
 */
@Entity
@Table(name = "bad_move")
public class BadMove {

  @Column(name = "kif_id")
  private String kifId;

  @Column(name = "move_num")
  private int moveNum;

  @Column(name = "best_score")
  private int bestScore;

  @Column(name = "actual_score")
  private int actualScore;

  @Column(name = "diff_score")
  private int diffScore;

  @Column(name = "sfen")
  private String sfen;

  @Column(name = "flipped_sfen")
  private String flippedSfen;

  @Column(name = "actual_move")
  private String actualMove;

  @Column(name = "pv")
  private String pv;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;

}

package com.mitrais.coding.test.demo.entity;

import com.mitrais.coding.test.demo.entity.common.BaseJpa;
import com.mitrais.coding.test.demo.entity.constant.CollectionName;
import com.mitrais.coding.test.demo.entity.fields.BaseMongoFields;
import com.mitrais.coding.test.demo.entity.fields.UserFields;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author hudaavianto
 */

@EqualsAndHashCode(callSuper = true)
@ToString
@Data
@Entity
@Table(name = CollectionName.USER)
public class User extends BaseJpa {

  @Id
  @Column(name = BaseMongoFields.ID)
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  @Column(name = UserFields.FIRST_NAME)
  private String firstName;

  @Column(name =UserFields.LAST_NAME)
  private String lastName;

  @Column(name = UserFields.DATE_OF_BIRTH)
  private Date DateOfBirth;

  @Column(name = UserFields.GENDER)
  private String gender;

  @Column(name = UserFields.EMAIL)
  private String email;


}

package com.mitrais.coding.test.demo.entity.common;

import com.mitrais.coding.test.demo.entity.fields.BaseMongoFields;
import java.util.Date;
import javax.persistence.Column;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * @author hudaavianto
 */

@ToString
@Data
public class BaseJpa {

  @CreatedDate
  @Column(name = BaseMongoFields.CREATED_DATE)
  private Date createdDate;

  @CreatedBy
  @Column(name = BaseMongoFields.CREATED_BY)
  private String createdBy = "SYSTEM";

  @LastModifiedDate
  @Column(name =BaseMongoFields.UPDATED_DATE)
  private Date updatedDate;

  @Column(name = BaseMongoFields.UPDATED_BY)
  private String updatedBy = "SYSTEM";

  @Column(name =BaseMongoFields.IS_DELETED)
  private Boolean isDeleted = false;

  @Column(name = BaseMongoFields.IS_ACTIVE)
  private Boolean isActive = true;

}

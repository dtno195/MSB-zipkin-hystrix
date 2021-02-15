package com.sd.userservice.valueobject;

import com.sd.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateValueObject {

  private User user;
  private DepartmentValueObject department;
}

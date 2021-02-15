package com.sd.userservice.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentValueObject {

  private Long departmentId;
  private String departmentName;
  private String departmentAddress;
  private String departmentCode;

}

package com.ymmihw.libraries.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.ymmihw.libraries.model.Division;
import com.ymmihw.libraries.model.DivisionDTO;
import com.ymmihw.libraries.model.Employee;
import com.ymmihw.libraries.model.EmployeeDTO;

@Mapper
public interface EmployeeMapper {

  @Mappings({@Mapping(target = "employeeId", source = "entity.id"),
      @Mapping(target = "employeeName", source = "entity.name"),
      @Mapping(target = "employeeStartDt", source = "entity.startDt",
          dateFormat = "dd-MM-yyyy HH:mm:ss")})
  EmployeeDTO employeeToEmployeeDTO(Employee entity);

  @Mappings({@Mapping(target = "id", source = "dto.employeeId"),
      @Mapping(target = "name", source = "dto.employeeName"), @Mapping(target = "startDt",
          source = "dto.employeeStartDt", dateFormat = "dd-MM-yyyy HH:mm:ss")})
  Employee employeeDTOtoEmployee(EmployeeDTO dto);

  DivisionDTO divisionToDivisionDTO(Division entity);

  Division divisionDTOtoDivision(DivisionDTO dto);

  List<Employee> convertEmployeeDTOListToEmployeeList(List<EmployeeDTO> list);

  List<EmployeeDTO> convertEmployeeListToEmployeeDTOList(List<Employee> list);

}

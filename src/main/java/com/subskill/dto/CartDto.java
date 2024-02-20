package com.subskill.dto;




import java.util.List;

public record CartDto(
        UserDto userDto,
        List<MicroSkillDto> listOfMicroSkills
) {

}
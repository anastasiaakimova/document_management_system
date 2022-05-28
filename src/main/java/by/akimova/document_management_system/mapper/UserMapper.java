package by.akimova.document_management_system.mapper;


import by.akimova.document_management_system.dto.UserDto;
import by.akimova.document_management_system.model.UserEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/*****************************************************************************************
 * @author Akimova Anastasia
 * @version 1.0
 *
 * Copyright (c) 2022.
 ****************************************************************************************/
@Mapper(componentModel = "spring")
@Component("userMapper")
public interface UserMapper {

    UserDto mapToDto(UserEntity userEntity);

    UserEntity mapToEntity(UserDto userDto);

    List<UserDto> mapToListDto(List<UserEntity> userEntityList);

    List<UserEntity> mapToEntityList(List<UserDto> userDtoList);

}
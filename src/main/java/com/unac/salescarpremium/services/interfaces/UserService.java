package com.unac.salescarpremium.services.interfaces;

import java.util.List;

import com.unac.salescarpremium.dtos.UserDTO;

public interface UserService {
    List<UserDTO> findAll();
    UserDTO findById(Long id);
    UserDTO save(UserDTO userDTO);
}

package com.legist.myapp.service;

import com.legist.myapp.domain.User;
import com.legist.myapp.dto.GuestDto;

import java.util.List;

public interface UserService {
    User register(GuestDto guestDto);
    List<User> getAll();
    User findByName(String name);
    User findById(String id);
    void delete(String id);

    boolean save(User user);
}

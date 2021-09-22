package com.compasso.uol.impp.Service;

import com.compasso.uol.impp.Entity.User;
import com.compasso.uol.impp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> listAll(){
        return userRepository.findAll();
    }
}

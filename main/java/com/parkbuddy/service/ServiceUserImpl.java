package com.parkbuddy.service;

import com.parkbuddy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUserImpl {

    @Autowired
    UserRepository userRepository;
}

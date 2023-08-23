package com.parkbuddy.ParkBuddy.webServices;

import com.parkbuddy.ParkBuddy.model.UserVO;
import com.parkbuddy.ParkBuddy.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Prueba {

    @Autowired
    ServiceUser serviceUser;

    @GetMapping("/prueba")
    public ResponseEntity<?> prueba(){
        List<UserVO> users = (List<UserVO>) serviceUser.findAll();

        return new ResponseEntity<List<UserVO>>(users, HttpStatus.OK);
    }

}

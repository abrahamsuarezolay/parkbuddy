package com.parkbuddy.ParkBuddy;

import com.parkbuddy.ParkBuddy.model.UserVO;
import com.parkbuddy.ParkBuddy.service.ServiceBooking;
import com.parkbuddy.ParkBuddy.service.ServiceParkingSpace;
import com.parkbuddy.ParkBuddy.service.ServiceUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ParkBuddyApplicationTests {

	@Autowired
	ServiceParkingSpace ps;

	@Autowired
	ServiceUser su;

	@Autowired
	ServiceBooking sb;

}

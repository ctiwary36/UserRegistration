package com.tsetuserregistration;

import com.userregistration.UserReg;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegTest {
    UserReg userReg = new UserReg();

    @Test
    void firstnameValidate() {
        String firstName = "Chandan";
        assertTrue(userReg.firstname(firstName));

    }

    @Test
    void lastName() {
        String lastName= "Tiwary";
        assertTrue(userReg.lastName(lastName));
    }

    @Test
    void email() {
        String email = "ctiwary@gmail.com";
        assertTrue(userReg.email(email));
    }

    @Test
    void mobile() {
        String mobile = "91 4575368110";
        assertTrue(userReg.mobile(mobile));
    }

    @Test
    void password() {
        String password = "Cti@123456";
        assertTrue(userReg.password(password));
    }
}
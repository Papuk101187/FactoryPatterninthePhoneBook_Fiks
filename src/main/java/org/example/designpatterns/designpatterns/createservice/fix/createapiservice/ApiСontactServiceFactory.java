package org.example.designpatterns.designpatterns.createservice.fix.createapiservice;

import org.example.services.ContactService;
import org.example.services.UsersService;

import java.util.ArrayList;

public interface ApiСontactServiceFactory <T>{

    ContactService createContactService();
     UsersService createUsersService();



}

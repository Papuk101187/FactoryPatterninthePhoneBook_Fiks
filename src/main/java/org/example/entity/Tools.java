package org.example.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.example.configuration.ConfigLoader;
import org.example.services.ContactService;
import org.example.services.UsersService;

import java.net.http.HttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


@Data
public class Tools {
    HttpClient httpClient;
    ObjectMapper objectMapper;
    ConfigLoader configLoader;
}
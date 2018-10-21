package cn.tomxin.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "")
public class WeatherController {

    @GetMapping(value = "/w")
    public String post(){
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> map = new HashMap<>();
        map.put("key", "846620c89548413f94b13165063c1c2d");
        map.put("location", "晋安");
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("https://search.heweather.com/find", String.class, map);
        return responseEntity.getBody();
    }
}

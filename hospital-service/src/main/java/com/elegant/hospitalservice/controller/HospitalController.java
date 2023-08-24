package com.elegant.hospitalservice.controller;

import com.elegant.hospitalservice.repository.HospitalRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HospitalController.class);

    HospitalRepository repository;

}

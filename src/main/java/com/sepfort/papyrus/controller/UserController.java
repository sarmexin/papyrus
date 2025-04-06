package com.sepfort.papyrus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sepfort.papyrus.model.TestModel;

@RestController
@RequestMapping("/user")
public class UserController {

	// TODO: for example
	
	private static final String TEXT = "testController is OK";

	@GetMapping(value = "/test/{id}")
    public static String testController(@PathVariable String id, @RequestBody TestModel testModel) {
        return TEXT + id + " " + testModel;
    }
}

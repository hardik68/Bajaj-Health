package com.bajajhealth.rest.controller;

import com.bajajhealth.rest.dto.StudentRequestDto;
import com.bajajhealth.rest.dto.StudentResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/bfhl")
public class StudentController {

    @PostMapping
    public ResponseEntity<Object> calculateResult(@RequestBody StudentRequestDto studentRequestDto)
    {
        StudentResponseDto studentResponseDto = new StudentResponseDto();
        try {
            studentResponseDto.setIs_success(true);
            studentResponseDto.setUser_id("hardik_setia_15032001");
            studentResponseDto.setEmail("hardik0811.cse19@chitkara.edu.in");
            studentResponseDto.setRoll_number("1910990811");
            List<String> numbers = new ArrayList<>();
            List<String> alphabets = new ArrayList<>();
            for (String inputStr : studentRequestDto.getData()) {
                boolean result = inputStr.matches("[0-9]+");

                if (result) {
                    numbers.add(inputStr);
                } else {
                    alphabets.add(inputStr);
                }
            }
            studentResponseDto.setAlphabets(alphabets);
            studentResponseDto.setNumbers(numbers);
            return new ResponseEntity<>(studentResponseDto, HttpStatus.OK);
        } catch (Exception ex) {
            studentResponseDto.setIs_success(false);
            studentResponseDto.setUser_id("john_doe_17091999");
            studentResponseDto.setEmail("john@xyz.com");
            studentResponseDto.setRoll_number("ABCD123");
            return new ResponseEntity<>(studentResponseDto, HttpStatus.OK);
        }
    }
}

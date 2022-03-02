package com.bajajhealth.rest.dto;

import java.util.List;

public class StudentResponseDto {
/*
* {
 "is_success": true,
 "user_id": "john_doe_17091999",
 “email” : “john@xyz.com”,
 “roll_number”:”ABCD123”,
 "numbers": [“2”,”4”,”5”,”92”],
 "alphabets": []
}
*
* */
    boolean is_success;
    String user_id;
    String email;
    String roll_number;
    List<String> numbers;
    List<String> alphabets;

    public boolean isIs_success() {
        return is_success;
    }

    public void setIs_success(boolean is_success) {
        this.is_success = is_success;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(String roll_number) {
        this.roll_number = roll_number;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }
}

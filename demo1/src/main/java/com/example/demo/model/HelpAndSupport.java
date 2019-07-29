package com.example.demo.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class HelpAndSupport {
    private  String name;
    private  double phone;
    private  String email;
    private  String message;


}

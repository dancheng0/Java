package com.pattern.create.builder;

public class Test {
    public static void main(String[] args) {  
        Builder builder = new Builder();  
        builder.produceMailSender(10);  
    }
}
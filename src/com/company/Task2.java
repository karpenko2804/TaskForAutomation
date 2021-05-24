package com.company;

public class Task2 {
    public static void main(String[] args) {

        if (args.length < 0) {
            System.out.println("Нет такого имени");
        }
        greetingsUser(args[0]);
    }

        public static String greetingsUser(String name){
            if (name == "Вячеслав") {
                return "Привет Вячеслав";
            }
        else{
                return "Нет такого имени";
        }

}
    }



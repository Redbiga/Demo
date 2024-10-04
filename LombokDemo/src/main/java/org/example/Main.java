package org.example;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student = Student.builder().name("张三").age(18).addHobby("篮球").addHobby("足球").build();
        System.out.println(student);
    }

}
@Builder
@Data
class  Student{
    private String name;
    private int age;
    @Singular("addHobby")
    private List<String> hobbies;
}

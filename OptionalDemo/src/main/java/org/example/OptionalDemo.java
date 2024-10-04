package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

    }
    @Test
    public void test1(){
        // null不报错，返回一个空描述,这个空描述就是Optional.empty这里的empty是Optional的一个常量
        Optional.ofNullable(null);
        System.out.println(  Optional.ofNullable(null));
//     会报空指针异常
//        Optional.of(null);
        System.out.println(Optional.empty());
    }
    @Test
    public void test2(){
     Person person = new Person("张三",1);
//     Optional是一个容器，Optional.ofNullable(person)若 t 不为 null,创建 Optional 实例其内容为person,否则创建空实例；
//        map(Function f): 如果有值对其处理，并返回处理后的Optional，否则返回 Optional.empty()。
//        这里的意思是把person的name取出来，然后放入到Optional中，然后返回
     Optional<String> name = Optional.ofNullable(person).map(Person::getName);
     System.out.println(name.get());
//     isPresent()，如果存在，干点啥
        name.ifPresent(this::test);
//        orElse()，如果存在，返回值，否则返回默认值
//        orElseGet()，如果存在，返回值，否则返回默认值
        System.out.println(name.orElseGet(()->"张三"));

    }
    public void test(String name){
        System.out.println(name);
    }


}
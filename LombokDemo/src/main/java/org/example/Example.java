package org.example;

import lombok.SneakyThrows;

/**
 * @author redA
 * @时间: 2024年06月21日 14:24
 */
import lombok.SneakyThrows;

public class Example {

    @SneakyThrows
    public void throwCheckedException() {
        throw new Exception("Checked exception thrown");
    }

    @SneakyThrows
    public void throwUncheckedException() {
        throw new RuntimeException("Unchecked exception thrown");
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.throwCheckedException();
        example.throwUncheckedException();
    }
}

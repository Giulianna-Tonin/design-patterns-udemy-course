package com.udemy.builder;

import java.util.ArrayList;
import java.util.List;

public class Code {

    String className;
    String name;
    String type;
    List<Code> fields = new ArrayList<>();

    public Code() {
    }

    public Code(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

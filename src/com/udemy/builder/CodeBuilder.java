package com.udemy.builder;

public class CodeBuilder {

    public Code code = new Code();

    public CodeBuilder(String className) {
        code.className = className;
    }

    public CodeBuilder addField(String name, String type) {
        Code c = new Code(name, type);
        code.fields.add(c);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("public class ").append(code.className).append("\n");
        sb.append("{" + "\n");
        for (Code c : code.fields) {
            sb.append("  public ").append(c.type).append(" ").append(c.name).append(";").append("\n");
        }
        sb.append("}");
        return sb.toString();

    }

}

package com.javalearning.core.strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java");
        builder.append(" Learning");
        builder.insert(5, "Programming ");
        builder.setCharAt(0, 'j');
        System.out.println(builder);

        builder.delete(0, 2);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        // StringBuffer provides similar mutable operations with synchronized methods.
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" Java");
        System.out.println(buffer);
    }
}

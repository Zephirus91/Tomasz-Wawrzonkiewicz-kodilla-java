package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();


        System.out.println(poemBeautifier.beautify("This is really NICE poem", t -> t.toUpperCase()));
        System.out.println(poemBeautifier.beautify("This is really NICE poem", t -> t.toLowerCase()));
        System.out.println(poemBeautifier.beautify("This is really NICE poem", t -> t.replace('e', 'n')));
        System.out.println(poemBeautifier.beautify("This is really NICE poem", t -> t.repeat(2)));
    }
}

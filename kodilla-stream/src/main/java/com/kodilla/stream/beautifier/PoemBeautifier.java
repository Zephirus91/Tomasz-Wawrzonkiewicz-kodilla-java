package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(PoemDecorator poemDecorator){
        String poem = poemDecorator.decorate();
        System.out.println(poem);
    }
}

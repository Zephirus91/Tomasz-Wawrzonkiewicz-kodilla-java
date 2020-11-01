package com.kodilla.stream.beautifier;

public class Poem {

    public static String poems() {
        String nicePoem = "This is really NICE poem";
        String bigPoem = nicePoem.toUpperCase();
        String smallPoem = nicePoem.toLowerCase();
        String strangePoem = nicePoem.replace('e', 'n');
        String twicePoem = nicePoem.repeat(2);

        return bigPoem + "\n" + smallPoem + "\n" + strangePoem + "\n" + twicePoem;

    }
}

package com.kodilla.stream;


import com.kodilla.stream.beautifier.Poem;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumberGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10,5, FunctionalCalculator::subBFromA);

        poemBeautifier.beautify(Poem::poems);

        System.out.println("Using Stream to generate even numbers from 1 to 20");

        NumberGenerator.generateEven(20);

        /* People.getList().stream()
                .map(String::toUpperCase)           //zadanie 7.3 przykł(a)

                .filter(s -> s.length() > 11)

                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")

                .filter(s -> s.substring(0, 1).equals("M"))

                .forEach(System.out::println);      //zadanie 7.3 przykł(a)

        BookDirectory theBookDirectory = new BookDirectory();               //zadanie 7.3 kolejny przykł(b)

        theBookDirectory.getList().stream()

                .filter(book -> book.getYearOfPublication() > 2005)

                .forEach(System.out::println);                              //zadanie 7.3 kolejny przykł(b)

        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()   //zad 7.3 przykł (c)

                .filter(book -> book.getYearOfPublication() > 2005)

                .collect(Collectors.toList());

        System.out.println("# elements: " +theResultListOfBooks.size());

        theResultListOfBooks.stream()

                .forEach(System.out::println);                                  //zad 7.3 przykł (c)

        BookDirectory theBookDirectory = new BookDirectory();                           przykł (d)

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);                                przykł (d)

        BookDirectory theBookDirectory = new BookDirectory();                   przykł (e)
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);                             przykł (e)  */

        Forum forum = new Forum();

        forum.getList().stream()

                .filter(forumUser -> forumUser.getSex() == 'M')

                .filter(forumUser -> forumUser.getPostsNumber() >= 1)

                .forEach(System.out::println);


        /* Map<String, ForumUser> theUsers = forum.getList().stream()

                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        theUsers.entrySet().stream()

                .filter(forumUser -> forumUser.getSex() == 'M')

                .filter(forumUser -> forumUser.getPostsNumber() >= 1)

                .forEach(System.out::println); TAK TO MA BYĆ ROBIONE ? JEST JAKIŚ BŁĄD  */



    }
}

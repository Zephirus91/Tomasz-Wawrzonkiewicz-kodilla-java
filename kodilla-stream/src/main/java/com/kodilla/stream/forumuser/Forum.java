package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {

        theUserList.add(new ForumUser(1111,"Mick Gog", 'M', LocalDate.of(1999, 05, 22), 0));
        theUserList.add(new ForumUser(2222,"Adam Fury", 'M', LocalDate.of(1995, 03, 11),43));
        theUserList.add(new ForumUser(3333,"Monica Louis", 'F', LocalDate.of(1990, 01, 16),148));
        theUserList.add(new ForumUser(4444,"Eva Lopez", 'F', LocalDate.of(2002, 9, 30),22));
        theUserList.add(new ForumUser(5555,"Matthew Kirsten", 'M', LocalDate.of(2005, 12, 06),75));

    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }

}

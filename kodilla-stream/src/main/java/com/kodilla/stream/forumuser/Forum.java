package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {

        theUserList.add(new ForumUser(1111,"Mick Gog", 'M',  0));
        theUserList.add(new ForumUser(2222,"Adam Fury", 'M', 43));
        theUserList.add(new ForumUser(3333,"Monica Louis", 'F', 148));
        theUserList.add(new ForumUser(4444,"Eva Lopez", 'F', 22));
        theUserList.add(new ForumUser(5555,"Matthew Kirsten", 'M', 75));

    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }

}

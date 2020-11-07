package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> result = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getPostsNumber() >= 1)
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.of(2000,1,1)))
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));
        for (Map.Entry<Integer, ForumUser> entry: result.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

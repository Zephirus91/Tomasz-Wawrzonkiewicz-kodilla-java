package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

public class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "select * from users";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("id") + ", " +
                    rs.getString("firstname") +
                    rs.getString("lastname"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "select u.firstname, u.lastname, count(*) as posts_number \n" +
        "from users u join posts p on u.id = p.user_id \n" +
        "group by p.user_id \n" +
        "having count(*) >= 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;

        while (rs.next()) {
            System.out.println(rs.getString("firstname") + ", " +
                    rs.getString("lastname") + ", " +
                    rs.getInt("posts_number"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(1, counter);
    }
}

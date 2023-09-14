package core;

import errors.CoreException;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 *
 * @author Roberto Vicario
 * @version 1.0
 */
public class DB {
    private final String USER_HOME = System.getProperty("user.home");

    public Connection getConnection() {
        try {
            Path path = Paths.get(USER_HOME, getDatabasePath());
            String url = "jdbc:sqlite:" + path;

            Class.forName("org.sqlite.JDBC");

            return DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException e) {
            throw new CoreException(e.getMessage());
        }
    }

    private String getDatabasePath() {
        String osName = System.getProperty("os.name").toLowerCase();
        String file = "todo.sqlite";

        if (osName.contains("win")) {
            return "ToDo\\" + file;
        } else {
            return "Library/ToDo/" + file;
        }
    }
}

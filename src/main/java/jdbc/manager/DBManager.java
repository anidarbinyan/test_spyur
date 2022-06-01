package jdbc.manager;

import core.ActionHelper;
import jdbc.conf.DBConnectionProvider;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {

    private Connection connection = DBConnectionProvider.getInstance().getConnection();

    public void createTable(){
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS results (ID int NOT NULL AUTO_INCREMENT, CompanyName varchar(255), PRIMARY KEY (ID));");
            System.out.println("Table created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void insertResult(String result){
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO results (CompanyName) VALUES ('"+ ActionHelper.addSlashes(result) + "');");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

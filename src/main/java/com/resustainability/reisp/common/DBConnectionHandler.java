package com.resustainability.reisp.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionHandler {

	public static void closeJDBCResoucrs(Connection connection, PreparedStatement preparedsstatement, ResultSet resultSet) {
        if (resultSet != null) {
            try {
            	resultSet.close();
            } catch (SQLException e) {
            }
            resultSet = null;
        }
        if (preparedsstatement != null) {
            try {
            	preparedsstatement.close();
            } catch (SQLException e) {
            }
            preparedsstatement = null;
        }
        if (connection != null) {
            try {
            	connection.close();
            } catch (SQLException e) {
            }
            connection = null;
        }
    }
}

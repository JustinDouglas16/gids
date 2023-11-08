package sr.unasat.gids.repositories;

import sr.unasat.gids.database.DatabaseConnectionManager;
import sr.unasat.gids.entities.Adres;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdresRepository {
    private Connection connection;

    public AdresRepository() {
        this.connection = DatabaseConnectionManager.getConnection();
    }

    public void close() {
        DatabaseConnectionManager.closeConnection(this.connection);
    }

    public int insertOneRecord(Adres adres) {
        PreparedStatement statement = null;
        int result = 0;

        try {
            String sql = "INSERT INTO personadres (id, adres) VALUES (?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, adres.getId());
            statement.setString(2, adres.getPersonAdres());
            result = statement.executeUpdate();
//            System.out.println("Inserted: " + employee.getFirstName() + " " + employee.getLastName());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }
}

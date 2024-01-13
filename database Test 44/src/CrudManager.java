import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudManager {

    public boolean saveData(Account account) throws SQLException, ClassNotFoundException {
        Connection connection = DbConnection.getInstance().getConnection();

        PreparedStatement preparedStatement1 = connection.prepareStatement(
                "INSERT INTO account VALUES(?,?,?)"
        );
        preparedStatement1.setString(1, account.getAccountId());
        preparedStatement1.setString(2, account.getName());
        preparedStatement1.setDouble(3, account.getAmount());

        boolean isSaved = preparedStatement1.executeUpdate() > 0;

        return isSaved;
    }
}

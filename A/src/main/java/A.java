import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A {

	public ResultSet executeSql(String sql, Connection con) throws SQLException {
		ResultSet resultSet = null;
		PreparedStatement statement = null;
		try {
			statement = con.prepareStatement(sql);
			resultSet = statement.executeQuery(sql);
			return resultSet;
		} catch (SQLException e) {
			throw e;
		}

	}
}
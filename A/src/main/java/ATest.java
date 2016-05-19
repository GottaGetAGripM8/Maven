import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ATest {
	private A a = new A();

	@Mock
	Connection con;

	@Mock
	private PreparedStatement preparedStatement;

	private ResultSet resultSet;

	@Test
	public void testExecuteQuery() throws SQLException {
		
		String sql = "select * from tabla";
		Mockito.when(con.prepareStatement(sql)).thenReturn(preparedStatement);
		Mockito.when(preparedStatement.executeQuery(sql)).thenReturn(resultSet);
		a.executeSql(sql, con);

	}

}

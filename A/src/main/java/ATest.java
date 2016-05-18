import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

public class ATest {
	private A a = new A();

	@Test
	public void testExecuteQuery() throws SQLException {
		String sql = "sadasd";
		Connection con = null;
		a.executeSql(sql, con);

	}

}

package repos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import repos.Repo;
import domain.EnumerationValue;
import mappers.IMaper;
import uow.IUnitOfWork;

public class EnumerationVR extends Repo<EnumerationValue>  implements IEnumerationVR {

	public EnumerationVR(Connection connection, IMaper<EnumerationValue> mapper, IUnitOfWork uow) {
		super(connection,mapper, uow);
	}
	
	
	public void setUpdateQuery(EnumerationValue eV) throws SQLException {
		update.setInt(5, eV.getId());
		update.setInt(1, eV.getIntKey());
		update.setString(4, eV.getEnumerationName());
		update.setString(2, eV.getStringKey());
		update.setString(3, eV.getValue());

	}

	public void setInsertQuery(EnumerationValue eV) throws SQLException {
		insert.setInt(1, eV.getIntKey());
		insert.setString(4, eV.getEnumerationName());
		insert.setString(2, eV.getStringKey());
		insert.setString(3, eV.getValue());

		
	}


	
	protected String insertSql() {
		return "INSERT INTO t_sys_enums(intKey,StringKey, evalue, enumerationName) VALUES (?,?,?,?)";
	}

	protected String updateSql() {
		return "UPDATE t_sys_enums SET intKey=?, StringKey=?, evalue = ?, enumerationName = ? WHERE id = ?";
	}
	
	protected String tableName() {
		return "t_sys_enums";
	}
	
	protected String createTableSql() {
		return "CREATE TABLE t_sys_enums("
				+ "id bigint GENERATED BY DEFAULT AS IDENTITY,"
				+"id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,"
				+ "intKey VARCHAR(20)," 
				+ "StringKey VARCHAR(20)," 
				+ "evalue VARCHAR(20)," 
				+ "enumerationName VARCHAR(20)"+ ")";
	}
	

	public List<EnumerationValue> withStringKey(String key, String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<EnumerationValue> withIntKey(int key, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EnumerationValue> withName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	public void add(EnumerationValue entity) {
		// TODO Auto-generated method stub
		
	}







	
	
	
}

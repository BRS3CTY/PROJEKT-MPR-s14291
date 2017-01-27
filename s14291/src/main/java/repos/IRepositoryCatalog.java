package repos;

import java.sql.SQLException;

public interface IRepositoryCatalog {
	

	public IUserRepository users();
	public IUserRoles userRoles();
	public IRolesPermissions RolesPermissions();
	public IEnumerationVR enumerations();
	
	public void saveAndClose() throws SQLException;
	

}

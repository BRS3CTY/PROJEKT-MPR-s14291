package repos;

import java.sql.Connection;
import java.sql.SQLException;

import mappers.EnumerationValueMapper;
import mappers.RolesPermissionsMapper;
import mappers.UserMapper;
import mappers.UserRolesMapper;
import uow.IUnitOfWork;
import uow.UnitOfWork;



public class RepoCatalog  implements IRepositoryCatalog {

	
	
	private Connection connection;
	private IUnitOfWork uow;
//	IUserRepository UserRepo;
//	IEnumerationValueRepository EnumerationValueRepository;
	
	public RepoCatalog(Connection connection) throws SQLException {
		super();
		this.connection = connection;
		uow = new UnitOfWork(connection);
	//	UserRepo = new UserRepository(connection, new UserMapper(), uow);
		
	}
	
	
	public IUserRepository users() {
		return new UserRepository(connection, new UserMapper(), uow);
		
	}
	
	public IUserRoles userRoles() {
		return new UserRolesRepository(connection, new UserRolesMapper(), uow);
		
	}
	
	public IRolesPermissions RolesPermissions() {
		return new RolesPermissionsRepository(connection, new RolesPermissionsMapper(), uow);
		
	}
	public IEnumerationVR enumerations() {
//		return EnumerationValueRepository;
		return new EnumerationVR(connection, new EnumerationValueMapper(), uow);
	}
	
	public void saveAndClose() throws SQLException {
		uow.saveChanges();
		connection.close();
		connection=null;
	}
	
}

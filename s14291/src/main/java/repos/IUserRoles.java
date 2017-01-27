package repos;

import java.util.List;
import repos.Repo;	
import domain.User;
import domain.UserRoles;

public interface IUserRoles extends IRepository<UserRoles>{
	public List<UserRoles> userId(int userId);
	public List<UserRoles> roleId(int rolesId);
}

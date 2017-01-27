package domain;

import java.util.ArrayList;
import java.util.List;

public class UserRoles  extends Entity {

	private int userId;
	private int roleId;
	
	private List<UserRoles> roles;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	
}

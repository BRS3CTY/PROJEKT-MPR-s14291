package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import domain.EnumerationValue;
import domain.RolesPermissions;
import domain.User;
import domain.UserRoles;
import repos.IRepositoryCatalog;
import repos.RepoCatalog;

public class App 
{
	

	
    public static void main( String[] args )
    {

       	try {

       		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb" );
    		IRepositoryCatalog catalogOf = new RepoCatalog(connection);
    		
    		/* Dodawanie użytkownika
    		User adam1 = new User();
    		adam1.setLogin("admin");
    		adam1.setPassword("pwadmin");			
			catalogOf.users().add(adam1);
			catalogOf.saveAndClose();
    		 */			
    		

			/* Dodawanie roli
   			UserRoles rola = new UserRoles();
    		rola.setId(1);
    		rola.setUserId(1);
    		rola.setRoleId(2);
    		catalogOf.userRoles().add(rola);
			catalogOf.saveAndClose();
    		*/		
    		
			/* Dodawanie uprawnień
			
			RolesPermissions permss= new RolesPermissions();
			permss.setRoleId(1);
			permss.setPermissionId(2);
			catalogOf.RolesPermissions().add(permss);
			catalogOf.saveAndClose();
			*/
    		
    		
			/* Usuwanie użytkownika
			User adam = new User();
			adam.setId(3);
			catalogOf.users().delete(adam);
			catalogOf.saveAndClose();
			*/
    		
			/* Update użytkownka
			User adam2 = new User();	
	 		adam2.setId(1);
			adam2.setLogin("new login");
			adam2.setPassword("new pass");		
			catalogOf.users().update(adam2);
			catalogOf.saveAndClose();
			*/
    		
    		/* Enumeration Value
			
			EnumerationValue enu= new EnumerationValue();
			enu.setValue("level 2");
			enu.setEnumerationName("Admin");
			catalogOf.enumerations().add(enu);
			catalogOf.saveAndClose();
			*/ 
			
       		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
    }
}

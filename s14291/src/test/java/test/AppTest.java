package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import domain.EnumerationValue;
import domain.RolesPermissions;
import domain.User;
import domain.UserRoles;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import repos.IRepositoryCatalog;
import repos.RepoCatalog;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     * @throws SQLException 
     */
	public void test () throws SQLException{
		
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb" );
		IRepositoryCatalog catalogOf = new RepoCatalog(connection);
		

		User adam = new User();
		adam.setLogin("admin");
		adam.setPassword("pwadmin");			
		catalogOf.users().add(adam);
		
		
		UserRoles rola = new UserRoles();
		rola.setId(1);
		rola.setUserId(1);
		rola.setRoleId(2);
		catalogOf.userRoles().add(rola);
		
		
		RolesPermissions permss= new RolesPermissions();
		permss.setRoleId(1);
		permss.setPermissionId(2);
		catalogOf.RolesPermissions().add(permss);
		
		
		EnumerationValue enum1 = new EnumerationValue();
		enum1.setIntKey(1);
		enum1.setStringKey("string");
		enum1.setValue("1");
		enum1.setEnumerationName("test");
		catalogOf.enumerations().add(enum1);
		catalogOf.saveAndClose();
		
	}
	
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
}

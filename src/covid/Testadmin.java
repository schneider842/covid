package covid;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Testadmin {

	private admin user1;
	
	@Before
	public void init() {
	
	 user1 = new admin(1,"admin","orsys" );
	}
	
	
	@Test
	public void testloginok() {
		assertEquals(true,user1.validationLogin("admin"));
	}
	@Test
	public void testmotdepasseok() {
		assertEquals(true,user1.validationMotdepasse("orsys"));
	}
	
	@Test
	public void testmotdepassnoneok() {
		assertEquals(false,user1.validationMotdepasse("toto"));
	}
	
	@Test
	public void testloginnonok() {
		assertEquals(false,user1.validationMotdepasse("admin1"));
	}
	
	
}

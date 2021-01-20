package covid;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;





public class TestCovid {

	private covid co;




	@Before
	public void init()
	{
		co = new covid(1,"toto","+782789969","Leguevi", "31490", 0 );
		
		
		
	}
	
	
	@Test
	public void testvalidationadresse() {
		assertEquals(true, co.validationAdresse("Leguevin1"));
	}
				
	@Test
	public void testvalidationcodepostale() {
		assertEquals(true,co.validationcodepostale("3149"));
	}
	@Test
	public void testvalidationtel() {
		assertEquals(true,co.validationtel("+0782789969"));
	}
	
	@Test
	public void testvalidationtelnonok() {
		assertEquals(false,co.validationtel("00000"));	
		
	}
	
	@Test
	public void testvalidationNomComplet() {
		assertEquals(true,co.validationNomComplet("mathieu schneider"));
	}
		
	@Test
	public void testetat() {
		assertEquals(true,co.valideetat(1));
	}
	
	
	}



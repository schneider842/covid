package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class Testdate {
	TestPcr TestPcr;
	
	@Before
public void init() {
	
	TestPcr = new TestPcr();
		
		
	}
	
	
	@Test
	public void test() {
		TestPcr.setJours(28);
		TestPcr.setMois(02);
		TestPcr.setAnnée(2020);		
		TestPcr.affiche();
		
	}

}

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
	public void testMoisentre1et12nonok() {
		TestPcr.setJours(28);
		TestPcr.setMois(13);
		TestPcr.setAnnée(2021);		
		TestPcr.affiche();
		
	}
	
	
	@Test
	public void testAnnéebisextilenonok() {
		TestPcr.setJours(29);
		TestPcr.setMois(02);
		TestPcr.setAnnée(2021);		
		TestPcr.affiche();
		
	}
	
	@Test
	public void testAnnéebisextile() {
		TestPcr.setJours(28);
		TestPcr.setMois(02);
		TestPcr.setAnnée(2020);		
		TestPcr.affiche();
		
	}
	
	
	
	@Test
	public void testjoursentre1et31pourAvrilnonok() {
		TestPcr.setJours(31);
		TestPcr.setMois(04);
		TestPcr.setAnnée(2021);		
		TestPcr.affiche();
		
	}
	
	@Test
	public void testjoursentre1et31pourMaiok() {
		TestPcr.setJours(31);
		TestPcr.setMois(05);
		TestPcr.setAnnée(2021);		
		TestPcr.affiche();
		
	}
	
	

}

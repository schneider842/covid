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
		TestPcr.setAnn�e(2021);		
		TestPcr.affiche();
		
	}
	
	
	@Test
	public void testAnn�ebisextilenonok() {
		TestPcr.setJours(29);
		TestPcr.setMois(02);
		TestPcr.setAnn�e(2021);		
		TestPcr.affiche();
		
	}
	
	@Test
	public void testAnn�ebisextile() {
		TestPcr.setJours(28);
		TestPcr.setMois(02);
		TestPcr.setAnn�e(2020);		
		TestPcr.affiche();
		
	}
	
	
	
	@Test
	public void testjoursentre1et31pourAvrilnonok() {
		TestPcr.setJours(31);
		TestPcr.setMois(04);
		TestPcr.setAnn�e(2021);		
		TestPcr.affiche();
		
	}
	
	@Test
	public void testjoursentre1et31pourMaiok() {
		TestPcr.setJours(31);
		TestPcr.setMois(05);
		TestPcr.setAnn�e(2021);		
		TestPcr.affiche();
		
	}
	
	

}

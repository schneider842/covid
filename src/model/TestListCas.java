package model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestListCas {
	ListCas Listing2;
	
	covid cas;
	covid cas1;
	
	
	@Before
	public void init()
	{
		Listing2 = new ListCas(5, new ArrayList<covid>());
		
		cas = new covid("toto","+782789969","Leguevi", "31490", 0 );		
		cas1 = new covid("toto1","+782789969","Leguevi", "31490", 0 );
	}

	
	
	@Test
	public void test() {
		
		Listing2.ajouter(cas);
		Listing2.ajouter(cas1);
		System.out.println(Listing2.toString());


		
	}
		
		
		
		
	}



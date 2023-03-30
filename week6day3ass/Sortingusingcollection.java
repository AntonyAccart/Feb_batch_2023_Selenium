package week6day3ass;


import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Sortingusingcollection {
public static void main(String[] args) {
	String[] company= {"HCl","Wipro","Aspire System","CTS"};
	List<String> companylist = new ArrayList<String>();

	for(int i=0; i< company.length; i++)
	{
		companylist.add(company[i]);
		
	}
	
	System.out.println(companylist);
	int size = companylist.size();

	System.out.println(size);
	Collections.sort(companylist);
	System.out.println(companylist);

	Collections.reverse(companylist);
	System.out.println(companylist);
	
	
		
	}
}

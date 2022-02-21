package org.system;

public class Sports {
   
	public void acheiver(String name, int medalCount) {
		System.out.println("My name "+name+" "+ "Medal count is "+medalCount);
			}
	
	public void acheiver(String country, String sportName, int rank) {
		
		    }
	
	public void acheiver(float weight, int height, long contactNo) {
	        }
	

	public void acheiver(String tournamentname, long prizeMoney) {
	}
	public static void main(String[] args) {
		
		Sports sp = new Sports();
		sp.acheiver("india","cricket", 1);
		sp.acheiver("Niresh Kumar", 5);
		sp.acheiver(60, 6, 1234567891);
		sp.acheiver("IPL", 500000000);
	}
}

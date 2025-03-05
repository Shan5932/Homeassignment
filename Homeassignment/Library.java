package Homeassignment;

public class Library {

	
		// TODO Auto-generated method stub
		
		public String addbook(String booktitle)
		{
			System.out.println("book added sucessfully");
			return booktitle;

		}
		
		 
		
		public void issueBook()

		{
			
			System.out.println("Book issued successfully");
		}
		
		String bicycle(String brandname)
		 {
			return brandname;
			 
		 }
		
		
		public static void main(String[] args) {
			
			
			Library book=new Library();
					book.addbook("ssd");
			book.issueBook();
			
			}	
	
	

}

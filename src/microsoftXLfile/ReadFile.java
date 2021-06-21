package microsoftXLfile;

import library.Xlfile_read;

public class ReadFile {

	public static void main(String[] args) {
//		Xlfile_read FROM LIBRARY
		Xlfile_read obj1 = new Xlfile_read("C:\\Users\\jagan\\OneDrive\\Desktop\\ReadXLfile.xlsx");
		System.out.println(obj1.get_data(0, 0, 0)); 
		int rows = obj1.row_count(0);
		for(int i=0;i<rows;i++)
		{
			String data = obj1.get_data(0, i, 0);
			System.out.println(data);
			
			
		}
		
	}

}

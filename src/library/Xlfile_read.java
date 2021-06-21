package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlfile_read {
	
	XSSFWorkbook WB;
	XSSFSheet sheet_name;
	
	public Xlfile_read(String XL_File_path)
	{
		File src = new File(XL_File_path);
		try {
//			 Fileinputstream is used to read the xl file in the form sequence of bytes.
	
			FileInputStream FIS = new FileInputStream(src);
			
//			TOTAL WORKBOOK WILL BE LOADED BY XSSFWORKBOOK
			 WB = new XSSFWorkbook(FIS);	
			 
//			 write the excel file with pass comment or any data type for that we need to create object of outputstream class with src file and use write command
			 WB.getSheetAt(0).getRow(0).createCell(2).setCellValue("pass");
			 FileOutputStream Fos = new FileOutputStream(src);
			 WB.write(Fos);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public String get_data(int sheet_index,int row,int column)
	
	{
		sheet_name = WB.getSheetAt(sheet_index);
		 String data1 = WB.getSheetAt(sheet_index).getRow(row).getCell(column).getStringCellValue();
		return data1;
		 
	}
	
	
	
//	to get the data in the first column this method is useful
	public int row_count(int sheet_index)
	
	{
	 		sheet_name = WB.getSheetAt(sheet_index);
	 		int count = sheet_name.getLastRowNum();
//	 		here i added 1 because it starts counting from zero onwards
			count = count+1;
			System.out.println("total rows in 1st column "+count);
			
			return count;
			
		 
	}
	

	
	

	

}

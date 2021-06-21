package microsoftXLfile;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class XLS_FILE {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\jagan\\OneDrive\\Desktop\\ReadExcelfile.xls");
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook WB = new HSSFWorkbook(fis);
		HSSFSheet sheet1 = WB.getSheetAt(0);
		String data1 =sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		int rows = sheet1.getLastRowNum();
//		int columns = sheet1.getRow(0).getLastCellNum();
//		or for line 20 you can use line 21
		int columns = sheet1.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rows);
		System.out.println(columns);
		WB.close();
		
		

	}

}

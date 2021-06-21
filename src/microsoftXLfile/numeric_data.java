package microsoftXLfile;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class numeric_data {
	static XSSFWorkbook WB;
	static XSSFSheet sheet_name;

	public static void main(String[] args)

	{
		File src = new File("C:\\Users\\jagan\\OneDrive\\Desktop\\numericfile.xlsx");
		try {
			// Fileinputstream is used to read the xl file in the form sequence of bytes.

			FileInputStream FIS = new FileInputStream(src);

			// TOTAL WORKBOOK WILL BE LOADED BY XSSFWORKBOOK
			WB = new XSSFWorkbook(FIS);
			sheet_name = WB.getSheetAt(0);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			System.out.println("i am in final block");
		}

		int count = sheet_name.getLastRowNum();
		count = count + 1;
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			int data = (int)WB.getSheetAt(0).getRow(i).getCell(0).getNumericCellValue();
//			double data_column = WB.getSheetAt(0).getRow(i).getCell(1).getNumericCellValue();
//			if (data_column.equals("sareedy")) {
//				System.out.println(data_column);
////				break;
//			}
			System.out.println(data)  ;

		}

	}

}

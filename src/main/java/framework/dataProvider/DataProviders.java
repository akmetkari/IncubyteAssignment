package framework.dataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviders {

	  @DataProvider(name = "CreateAccount")
	  public  Object[][] getAccountCreateTestData() throws IOException 
	  {
		  String filePath = "D:\\Learning\\New Workspace\\AkshayFramework\\TestData\\CreateAccount.xlsx";
	        String sheetName = "Sheet1";
	        return getExcelData(filePath, sheetName);
	   }

	
		public static Object[][] getExcelData(String filePath, String sheetName) throws IOException {
	        FileInputStream fis = new FileInputStream(filePath);
	        Workbook workbook = new XSSFWorkbook(fis);
	        Sheet sheet = workbook.getSheet(sheetName);

	        List<Object[]> data = new ArrayList<>();

	        for (int i = 1; i <= sheet.getLastRowNum(); i++) { // Start from row 1 (skip header)
	            Row row = sheet.getRow(i);
	            String[] rowData = new String[5]; // Assuming 5 columns
	            for (int j = 0; j < 5; j++) {
	                Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
	                rowData[j] = cell.toString();
	            }
	            data.add(rowData);
	        }

	        workbook.close();
	        fis.close();

	        // Convert List to Object[][] for DataProvider
	        return data.toArray(new Object[0][0]);
	    }
	

	
	
}

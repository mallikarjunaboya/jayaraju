package zachry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
public static FileInputStream fis;
public static XSSFWorkbook wbo;
public static XSSFSheet wso;
public static FileOutputStream fos;

	public static void main(String[] args) throws IOException {

		
		
			fis=new FileInputStream("‪C:\\Users\\ARJUN\\Desktop\\Book1.xlsx");
			wbo=new XSSFWorkbook();
			wso=wbo.getSheet("Sheet1");
			Row r;
			int rc=wso.getLastRowNum();
			for (int i =0; i < rc; i++) {
			r=wso.getRow(i);
			int clm=r.getLastCellNum();
			for (int j = 0; j < clm; j++) {
				
			System.out.print(r.getCell(j).getStringCellValue());
				
				
			}
			System.out.println();
			
			/*fos=new FileOutputStream("‪C:\\Users\\ARJUN\\Desktop\\Book1.xlsx");
			wbo.write(fos);	
				*/
			}
			
			
			
		
		{
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

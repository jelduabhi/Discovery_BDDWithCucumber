package discovery.framework;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.cucumber.listener.Reporter;

import discovery.utility.CommonMethods;


public class TestReport extends CommonMethods{

	static String screen_name;
	static String folder_name;
	 
	
	public static void folder_meth(String foldername) {
		folder_name=foldername;
	}
	public static void clipScreenShot(String step_name) {
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			screen_name = timeStamp+"_"+step_name + "_" + timeStamp + ".png";
			FileUtils.copyFile(scrFile, new File("./" + folder_name + "/" + screen_name));
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			File f =new File("./",folder_name+"//"+screen_name);
			String new_ssss = f.getAbsolutePath();
			Reporter.addScreenCaptureFromPath(new_ssss);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static void screenshot_folder_structure(String arg1){
		String folder_todaydate = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
		System.out.println("folder_todaydate: "+folder_todaydate);
		String first_folder_name = "REPORTS";
		
		File file1 = new File("./",("\\"+first_folder_name));
        if (!file1.exists()) {
            if (file1.mkdirs()) {
                System.out.println("Multiple directories are created!1111");
            } else {
                System.out.println("Failed to create multiple directories!");
            }
        }
				folder_meth("\\"+first_folder_name);
		}
}

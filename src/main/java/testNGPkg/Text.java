package testNGPkg;

import org.openqa.selenium.By;

public class Text {
	
	By username_s = By.id("auth_user_name");
	By password_s = By.id("auth_password");
	By school_s = By.id("auth_school");
	By login_s = By.name("Login");
	By studentsOption_s = By.xpath("//span[contains(text(),'STUDENTS')]");
	By studentsAttendenceOption_s = By.id("(//a[contains(text(),'Students Attendance')])[1]");
	By className_s = By.id("class_name");
	By sectionId_s = By.id("sectionId");
	
	By exams_s = By.xpath("//span[contains(text(),'EXAMS')]");
	By marksEntry_s = By.xpath("(//a[contains(text(),'Marks Entry')])[1]");
	By examMainType_s = By.id("exam_main_type_id_for_exam_name_comb");
	By ExamType_s = By.id("exam_type_id_for_exam_type_combo");


}

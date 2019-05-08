package com.acttime.createCustomerTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.acttime.objectrepositorylib.OpenTask;
import com.genericlibrary.BaseClass;

public class TaskTest extends BaseClass{
@Test
public void createTaskTest(){
	/*click on create customer button*/
	OpenTask opT=PageFactory.initElements(driver, OpenTask.class);
	opT.clickCreateTasksButton();
	/**/
	
}
}

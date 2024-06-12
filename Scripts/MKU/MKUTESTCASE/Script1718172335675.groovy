import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mkuniversity.ac.in/new/')

if (true) {
}

WebUI.click(findTestObject('Object Repository/MKU/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/font_NIRF'))

WebUI.click(findTestObject('Object Repository/MKU/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/strong_NIRF - 2024'))

WebUI.click(findTestObject('Object Repository/MKU/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/a_WIFI-Form'))

WebUI.click(findTestObject('Object Repository/MKU/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/a_Research'))

WebUI.click(findTestObject('Object Repository/MKU/Page_Welcome to MKU Research Department/span_Home'))

WebUI.click(findTestObject('Object Repository/MKU/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/font_Academics'))

WebUI.click(findTestObject('Object Repository/MKU/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/a_School of Linguistics and Communication'))

WebUI.click(findTestObject('Object Repository/MKU/Page_MKU-School of Linguistics and Communication/a_Read More'))

WebUI.closeBrowser()


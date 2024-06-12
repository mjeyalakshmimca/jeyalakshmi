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

WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?ifkv=AS5LTARjZjzId9mesXLh-ld66Yg16ayXy3GJbbeqH0ns7uMeCAcWliUnM_yULe3oYRul9uWK1lbd&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S789244714%3A1718176295109175&ddm=0')

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/div_Not your computer Use Guest mode to sig_371298'))

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/path'))

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/span_Use your Google Account'))

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/div_Learn more about using Guest mode_VfPpk_8ca253'))

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/span_Create account'))

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/path'))

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/path_1'))

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/path_1_2'))

WebUI.closeBrowser()


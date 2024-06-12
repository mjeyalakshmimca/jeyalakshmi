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

WebUI.navigateToUrl('https://annamalaiuniversity.ac.in/index.php')

WebUI.click(findTestObject('Object Repository/ANNAMALAI/Page_Annamalai University/a_Home'))

WebUI.click(findTestObject('Object Repository/ANNAMALAI/Page_Annamalai University/a_Read more'))

WebUI.switchToWindowTitle('Annamalai University')

WebUI.click(findTestObject('Object Repository/ANNAMALAI/Page_Annamalai University/a_Administration'))

WebUI.click(findTestObject('Object Repository/ANNAMALAI/Page_Annamalai University/h4_Administration'))

WebUI.click(findTestObject('Object Repository/ANNAMALAI/Page_Annamalai University/a_Syndicate Members'))

WebUI.click(findTestObject('Object Repository/ANNAMALAI/Page_Annamalai University/a_Academic Council Members'))

WebUI.click(findTestObject('Object Repository/ANNAMALAI/Page_Annamalai University/strong_Under Construction'))

WebUI.click(findTestObject('Object Repository/ANNAMALAI/Page_Annamalai University/a_Academic Council'))

WebUI.click(findTestObject('Object Repository/ANNAMALAI/Page_Annamalai University/a_HOME (1)'))

WebUI.click(findTestObject('Object Repository/ANNAMALAI/Page_Annamalai University/a_Infrastructure'))

WebUI.click(findTestObject('Object Repository/ANNAMALAI/Page_Annamalai University/p_Being a nine-decade old institution, the _d7b7b4'))

WebUI.click(findTestObject('Object Repository/ANNAMALAI/Page_Annamalai University/p_Being a nine-decade old institution, the _d7b7b4'))

WebUI.click(findTestObject('Object Repository/ANNAMALAI/Page_Annamalai University/a_Library'))

WebUI.closeBrowser()


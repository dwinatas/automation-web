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

WebUI.navigateToUrl('https://www.ruparupa.com/')

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.delay(30)

WebUI.click(findTestObject('Buy Product/Button - Dont Allow'))

WebUI.click(findTestObject('Buy Product/Textfield - Pencarian'))

WebUI.setText(findTestObject('Buy Product/Textfield - Pencarian'), 'Beli 1 Gratis 1')

WebUI.click(findTestObject('Buy Product/Button - Pencarian'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Buy Product/Text - Beli 1 Gratis 1'), 'Beli 1 Gratis 1')

WebUI.scrollToElement(findTestObject('Buy Product/Text - Semua Diskon'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Buy Product/Button - Filter'))

WebUI.click(findTestObject('Buy Product/List - Product Terbaru'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Buy Product/Image - Product 1'), 5)

WebUI.verifyElementPresent(findTestObject('Buy Product/Text - Product Title'), 5)

WebUI.verifyElementPresent(findTestObject('Buy Product/Text - Porudct Price'), 5)

WebUI.click(findTestObject('Buy Product/Button - Product 1'))

WebUI.delay(5)

WebUI.click(findTestObject('Buy Product/Button - Tambah ke Keranjang'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Buy Product/Text - Berhasil Ditambahkan Ke Keranjang'), 'Berhasil Ditambahkan ke Keranjang')

WebUI.click(findTestObject('Buy Product/Button - Liihat Keranjang Saya'))

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.focus(findTestObject('Buy Product/Icon - Keranjang'))

WebUI.click(findTestObject('Buy Product/Button - Lanjut ke Keranjang'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Buy Product/Button - Lanjut Ke Pembayaran'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Buy Product/Text - Masuk Daftar'), 'Masuk/Daftar')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Buy Product/Textfield - Email'))

WebUI.setText(findTestObject('Buy Product/Textfield - Email'), 'dwinata@gmail.com')

WebUI.click(findTestObject('Buy Product/Textfield - Password'))

WebUI.setText(findTestObject('Buy Product/Textfield - Password'), 'Password1!2@')

WebUI.click(findTestObject('Buy Product/Button - Masuk'))

WebUI.delay(5)

WebUI.verifyTextPresent('Informasi tidak valid', false)

WebUI.takeScreenshot()

WebUI.closeBrowser()


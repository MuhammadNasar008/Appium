from selenium.webdriver.common.by import By


class LoginElements:
    USERACCOUNTBUTTON = (By.XPATH, "//div[@class='dropdown']//a[@data-toggle='dropdown']")
    SIGNOUTBUTTON = (By.XPATH, "//span[text()='Sign Out']")
    EDITNAMEFIELD = (By.XPATH, "//input[@id='edit-name']")
    EDITPASSFIELD = (By.XPATH, "//input[@id='edit-pass']")
    LOGINBUTTON = (By.XPATH, "// input[ @ id = 'edit-submit']")

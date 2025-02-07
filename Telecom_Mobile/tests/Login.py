import unittest
from selenium import webdriver

from lib.pages_screen import LoginPage
from lib.utils.urls import Url


class Login(unittest.TestCase):
    """A sample test class to show how page object works"""

    @classmethod
    def setUp(self):
        self.driver = webdriver.Chrome(Url.CHROME_PATH)
        self.driver.implicitly_wait(30)
        self.driver.maximize_window()
        self.driver.get(Url.HOME_URL)

    def testLogin(self):
        login_screen = LoginPage.LoginPage(self.driver)
        login_screen.verifyLogin()

    @classmethod
    def tearDown(self):
        self.driver.close()
        self.driver.quit()
#
# if __name__ == "__main__":
#     unittest.main(testRunner=HtmlTestRunner.HTMLTestRunner(output='C:/Users/Administrator/Documents/HassanNaeem/commonsense_python/reports', report_title='Signup test'))
#

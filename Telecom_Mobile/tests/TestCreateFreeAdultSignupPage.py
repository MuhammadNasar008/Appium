import unittest
from selenium import webdriver

from lib.pages_screen import CreateFreeAdultSignupPage
from lib.utils.urls import Url


class TestCreateFreeAdultSignupPage(unittest.TestCase):
    @classmethod
    def setUp(self):
        self.driver = webdriver.Chrome(Url.CHROME_PATH)
        self.driver.implicitly_wait(30)
        self.driver.maximize_window()
        self.driver.get(Url.HOME_URL)

    def test_free_adult_signup(self):
        adult_signup = CreateFreeAdultSignupPage.CreateFreeAdultSignupPage(self.driver)
        adult_signup.test_free_adult_signup()

    @classmethod
    def tearDown(self):
        self.driver.close()
        self.driver.quit()


if __name__ == "__main__":
    unittest.main()

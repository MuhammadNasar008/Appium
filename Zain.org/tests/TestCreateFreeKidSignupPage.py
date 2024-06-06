import unittest
from selenium import webdriver

from lib.pages_screen import CreateFreeKidSignupPage
from lib.utils.urls import Url


class TestCreateFreeKidSignupPage(unittest.TestCase):
    @classmethod
    def setUp(self):
        self.driver = webdriver.Chrome(Url.CHROME_PATH)
        self.driver.implicitly_wait(30)
        self.driver.maximize_window()
        self.driver.get(Url.HOME_URL)

    def test_free_kid_signup(self):
        adult_signup = CreateFreeKidSignupPage.CreateFreeKidSignupPage(self.driver)
        adult_signup.test_free_kid_signup()

    @classmethod
    def tearDown(self):
        self.driver.close()
        self.driver.quit()


if __name__ == "__main__":
    unittest.main()

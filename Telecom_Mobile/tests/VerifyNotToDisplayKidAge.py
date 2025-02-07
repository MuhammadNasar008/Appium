import unittest
from selenium import webdriver

from lib.pages_screen.NotToDisplayTheirKidsAgePage import NotToDisplayKidAge
from lib.utils.urls import Url


class VerifyNotToDisplayKidAge(unittest.TestCase):
    @classmethod
    def setUp(self):
        self.driver = webdriver.Chrome(Url.CHROME_PATH)
        self.driver.implicitly_wait(30)
        self.driver.maximize_window()
        self.driver.get(Url.HOME_URL)

    def testNotToDisplayKidAge(self):
        plus_adding_kid = NotToDisplayKidAge(self.driver)
        plus_adding_kid.test_not_to_display_kid_age()

    # @classmethod
    # def tearDown(self):
    # self.driver.close()
    # self.driver.quit()


if __name__ == "__main__":
    unittest.main()

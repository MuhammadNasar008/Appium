import unittest
from selenium import webdriver

from lib.pages_screen import PlusEntertainmentAgeLimitPage
from lib.utils.urls import Url


class PlusEntertainmentAgeLimit(unittest.TestCase):
    @classmethod
    def setUp(self):
        self.driver = webdriver.Chrome(Url.CHROME_PATH)
        self.driver.implicitly_wait(30)
        self.driver.maximize_window()
        self.driver.get(Url.HOME_URL)

    def testEntertainmentAgeLimit(self):
        entertainmentage = PlusEntertainmentAgeLimitPage.PlusEntertainmentAgeLimitPage(self.driver)
        entertainmentage.verifying_plus_entertainment_age_limit()

    # @classmethod
    # def tearDown(self):
    # self.driver.close()
    # self.driver.quit()


if __name__ == "__main__":
    unittest.main()

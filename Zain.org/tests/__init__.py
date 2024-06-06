import unittest
from selenium import webdriver

from lib.utils.urls import Url


class Init(unittest.TestCase):
    @classmethod
    def setUp(self):
        self.driver = webdriver.Chrome(Url.CHROME_PATH)
        self.driver.implicitly_wait(30)
        self.driver.maximize_window()
        self.driver.get(Url.HOME_URL)
    @classmethod
    def tearDown(self):
        self.driver.close()
        self.driver.quit()
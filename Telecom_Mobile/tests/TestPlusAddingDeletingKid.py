import allure
import unittest
from allure_commons.types import AttachmentType
from selenium import webdriver

from lib.pages_screen import PlusAddingDeletingKid
from lib.utils.urls import Url


class TestPlusAddingDeletingKid(unittest.TestCase):
    """A sample test class to show how page object works"""

    @classmethod
    def setUp(self):
        self.driver = webdriver.Chrome(Url.CHROME_PATH)
        self.driver.implicitly_wait(30)
        self.driver.maximize_window()
        self.driver.get(Url.HOME_URL)

    def testPlusAddingDeletingKid(self):
        login_screen = PlusAddingDeletingKid.PlusAddingDeletingKid(self.driver)
        login_screen.verifyingPlusAddingDeletingKid()

    @classmethod
    def tearDown(self):
        allure.attach(self.driver.get_screenshot_as_png(), name="AddKidAndDeleteKid"
                      ,
                      attachment_type=AttachmentType.PNG)
        self.driver.close()
        self.driver.quit()


#
if __name__ == "__main__":
    unittest.main()

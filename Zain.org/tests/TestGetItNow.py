import unittest
from selenium import webdriver

from lib.pages_screen import GetItNow
from lib.utils.urls import Url


class MovieStream(unittest.TestCase):
    """A sample test class to show how page object works"""

    @classmethod
    def setUp(self):
        self.driver = webdriver.Chrome(Url.CHROME_PATH)
        self.driver.implicitly_wait(30)
        self.driver.maximize_window()
        self.driver.get(Url.HOME_URL)

    def testMovieStream(self):
        stream = GetItNow.GetItNow(self.driver)
        stream.verifying_get_it_now()

    @classmethod
    def tearDown(self):
        self.driver.close()
        self.driver.quit()


#
if __name__ == "__main__":
    unittest.main()

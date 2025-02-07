import unittest
from selenium import webdriver

from lib.pages_screen import CreateTeenAccountForUs_and_InternationalPage
from lib.utils.urls import Url


class TestCreateTeenAccountForUs_and_International(unittest.TestCase):
    @classmethod
    def setUp(self):
        self.driver = webdriver.Chrome(Url.CHROME_PATH)
        self.driver.implicitly_wait(30)
        self.driver.maximize_window()
        self.driver.get(Url.HOME_URL)

    # def test_free_kid_signup(self):
    #     kid_signup = KidSignupPage.KidSignupPage(self.driver)
    #     kid_signup.test_kid_signup_with_empty_Parameter()
    #     kid_signup.test_kid_signup()
    # def test_free_adult_signup(self):
    #     adult_signup = CreateFreeAdultSignupPage.CreateFreeAdultSignupPage(self.driver)
    #     adult_signup.test_free_adult_signup_wit    splitted_name = test_data['name'].split(" ", 1)h_empty_parameter()
    #     adult_signup.test_free_adult_signup()
    def test_free_teen_signup_for_us_and_international(self):
        teen_signup = CreateTeenAccountForUs_and_InternationalPage.CreateTeenAccountForUs_and_InternationalPage(
            self.driver)
        teen_signup.test_free_teen_signup_for_international()
        teen_signup.test_free_teen_signup_for_us()

    @classmethod
    def tearDown(self):
        self.driver.close()
        self.driver.quit()


if __name__ == "__main__":
    unittest.main()

import allure
import random
import time
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import WebDriverWait

from lib.web_elements.home_elements import HomeElements


class BasePage:
    # this function is called every time a new object of the base class is created.
    def __init__(self, driver):
        self.driver = driver

    @allure.step("Click Sigin Button")
    def click_sigin_button(self):
        self.click(HomeElements.SIGNIN_BUTTON, "SignIn Menu")

    @allure.step("Click Cookies Close Popup Button")
    def click_cookies_close_popup_button(self):
        self.click(HomeElements.COOKIES_POPUP_CLOSE_BUTTON, "Close Cookies Popup Button")

    # this function performs click on web element whose locator is passed to it.

    def click(self, by_locator, element_label):
        #  print("Clicking " + element_label)
        WebDriverWait(self.driver, 15).until(EC.visibility_of_element_located(by_locator)).click()

    # this function asserts comparison of a web element's text with passed in text.

    def assert_element_text(self, by_locator, element_text):
        web_element = WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator))
        assert web_element.text == element_text

    @staticmethod
    @allure.step("Compare actual_value {0} eih expected_value {1} ")
    def assert_True(actual_value, expected_value):
        assert actual_value == expected_value

    # this function performs text entry of the passed in text, in a web element whose locator is passed to it.

    def enter_text(self, by_locator, text, element_label):
        if text != "":
            #  print("Entering " + str(element_label) + " : " + text)
            WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator)).clear()
            return WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator)).send_keys(text)
        elif text == "":
            WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator)).clear()
            return WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator)).send_keys(
                Keys.ENTER)

    def is_enabled(self, by_locator):
        try:
            WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator))
            return True
        except:
            return False

    # this function checks if the web element whose locator has been passed to it, is visible or not and returns
    # true or false depending upon its visibility.
    @allure.step("element_label {2}")
    def is_visible(self, by_locator, element_label):
        try:
            WebDriverWait(self.driver, 15).until(EC.visibility_of_element_located(by_locator))
            return True
        except Exception as e:
            return False

    # this function moves the mouse pointer over a web element whose locator has been passed to it.
    def hover_to(self, by_locator):
        element = WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator))
        ActionChains(self.driver).move_to_element(element).perform()

    def scroll_to(self, by_locator):
        element = WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator))
        self.driver.execute_script("arguments[0].scrollIntoView();", element)

    def get_element_text(self, by_locator):
        element = WebDriverWait(self.driver, 20).until(EC.visibility_of_element_located(by_locator))
        return element.text

    def generate_random_age(self, stating_index, ending_index):
        value = random.randint(stating_index, ending_index)
        return value

    def get_html_element_text(self, by_locator):
        element = WebDriverWait(self.driver, 20).until(EC.visibility_of_element_located(by_locator))
        return element.get_attribute('::after')

    def get_element_attribute_value(self, by_locator, attribute_name, element_label):
        #   print("Getting " + element_label + " attribute data: " + attribute_name)
        element = WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator))
        return element.get_attribute(attribute_name)

    def get_element(self, by_locator):
        element = WebDriverWait(self.driver, 10).until(EC.visibility_of_element_located(by_locator))
        return element

    def get_current_url(self):
        return self.driver.current_url

    def wait(self, seconds=3):
        time.sleep(seconds)

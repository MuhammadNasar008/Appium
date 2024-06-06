import allure
import random
import re
import string
from faker import Faker
from selenium.webdriver.common.by import By

from lib.page_objects.BasePage import BasePage
from lib.utils.constants import Constants
from lib.web_elements.signup_detail_elements import SignUpDetailElements

regex = '^[a-z0-9]+[\._]?[a-z0-9]+[@]\w+[.]\w{2,3}$'


class SignupDetailObject(BasePage):

    def __init__(self, driver):
        self.driver = driver

    @allure.step("Click Age Month Dropdown")
    def click_select_age_month_field(self):
        self.click(SignUpDetailElements.AGE_MONTH_FIELD, "Age Month Dropdown")

    @allure.step("Select month_number {1}")
    def select_age_month(self, month_number):
        if str(month_number) == "":
            element = self.get_element_text(SignUpDetailElements.AGE_MONTH_FIELD_ERROR_FIELD, "")
        #   print(element + "<br>")
        else:

            month_option = (By.XPATH, "//select[@id='edit-field-birthday-und-0-value-month']//option[@value='" + str(
                month_number) + "']")
            self.click(month_option, "Month Number: " + str(month_number))

    @allure.step("Click Agree Terms checkbox")
    def click_agree_checkbox(self):
        self.click(SignUpDetailElements.AGREE_CHECKBOX, "Agree Terms checkbox")

    @allure.step("Click Teen Continue Button")
    def click_continue_button(self):
        self.click(SignUpDetailElements.CONTINUE_BUTTON, "Teen Continue Button")

    @allure.step("Click Age Year Dropdown")
    def click_select_age_year_field(self):
        self.click(SignUpDetailElements.AGE_YEAR_FIELD, "Age Year Dropdown")

    @allure.step("Click User Account")
    def click_select_user_account(self):
        self.click(SignUpDetailElements.USERACCOUNTBUTTON, "User Account ")

    @allure.step("Click Sign Out Button")
    def click_select_signout_button(self):
        self.click(SignUpDetailElements.SIGNOUTBUTTON, "Sign Out Button")

    @allure.step("Select year {1}")
    def select_age_year(self, year):
        year_option = (
            By.XPATH,
            "//select[@id='edit-field-birthday-und-0-value-year']//option[@value='" + str(year) + "']")
        self.click(year_option, "Month Year: " + str(year))

    @allure.step("Click Not US checkbox")
    def click_not_us_checkbox(self):
        self.click(SignUpDetailElements.NOT_US_CHECKBOX, "Not US checkbox")

    @allure.step("Click Country Dropdown")
    def click_country_field(self):
        self.click(SignUpDetailElements.COUNTRY_FIELD, "Country Dropdown")

    @allure.step("Select country_name {1}")
    def select_country(self, country_name):
        if country_name == "" or country_name == "Select":
            #  print(country_name)
            self.click_country_field()
            self.wait(5)
            self.wait(5)
            element = self.get_element_text(SignUpDetailElements.COUNTRY_FIELD_ERROR_MESSAGE, "")
        #   print(element + "<br>")
        else:
            country_option = (
                By.XPATH,
                "//select[@id='edit-field-user-location-und-0-country']//option[text()='" + str(country_name) + "']")
            self.click(country_option, "Country: " + str(country_name))

    @allure.step("Enter Teen Email {1}")
    def enter_teen_email(self, email):

        if re.search(regex, email):
            self.enter_text(SignUpDetailElements.TEEN_EMAIL_FIELD, email, "Teen Email")
        else:
            self.enter_text(SignUpDetailElements.TEEN_EMAIL_FIELD, email)
            self.wait(5)
            element = self.get_element_text(SignUpDetailElements.ADULT_EMAIL_FIELD_ERROR_MESSAGE, "")
        #    print(element + "<br>")

    @allure.step("Enter UserName {1}")
    def enter_username(self, username):
        if username != "":
            self.enter_text(SignUpDetailElements.USERNAME_FIELD, username, "Teen Username")
        else:
            self.enter_text(SignUpDetailElements.USERNAME_FIELD, username)
            self.wait(5)
            element = self.get_element_text(SignUpDetailElements.USERNAME_FIELD_ERROR_MESSAGE, "")
            print(element + "<br>")

    @allure.step("Enter Password {1}")
    def enter_password(self, password):
        if password != "":
            self.enter_text(SignUpDetailElements.PASSWORD_FIELD, password, "Teen Password")
        else:
            self.enter_text(SignUpDetailElements.PASSWORD_FIELD, password)
            self.wait(5)
            element = self.get_element_text(SignUpDetailElements.PASSWORD_FIELD_ERROR_MESSAGE, "")
        #  print(element + "<br>")

    @allure.step("Click Next Button")
    def click_next_button(self):
        self.click(SignUpDetailElements.NEXT_BUTTON, "Next Button")

    def generate_random_password(self, length=8):
        password_characters = string.ascii_letters + string.digits + string.punctuation
        password = ''.join(random.choice(password_characters) for i in range(length))
        return password

    def generate_test_data(self, category='adult'):
        faker = Faker()
        test_data = faker.simple_profile()

        splitted_name = test_data['name'].split(" ", 1)

        if category == 'adult':
            return {
                'first_name': splitted_name[0],
                'last_name': splitted_name[1],
                'email': test_data['mail'],
                'username': test_data['username'],
                'password': Constants.SIGNUP_DETAIL_TEST_PASSWORD,
            }
        elif category == 'kid':
            parent_test_data = faker.simple_profile()
            return {
                'username': test_data['username'],
                'password': Constants.SIGNUP_DETAIL_TEST_PASSWORD,
                'parent_email': parent_test_data['mail']
            }
        elif category == 'teen':
            test_data = faker.simple_profile()
            return {
                'email': test_data['mail'],
                'username': test_data['username'],
                'password': Constants.SIGNUP_DETAIL_TEST_PASSWORD,
                'parent_email': test_data['mail']
            }

    # Adult Signup Page Actions
    @allure.step("Enter First Name{1} ")
    def enter_adult_first_name(self, first_name):
        if first_name != "":
            self.enter_text(SignUpDetailElements.ADULT_FIRST_NAME_FIELD, first_name, "Adult First Name")
        else:
            self.enter_text(SignUpDetailElements.ADULT_FIRST_NAME_FIELD, first_name)
            self.wait(5)
            element = self.get_element_text(SignUpDetailElements.ADULT_FIRST_NAME_FIELD_ERROR_MESSAGE, "")
        #  print(element + "<br>")

    @allure.step("Enter LastName {1} ")
    def enter_adult_last_name(self, last_name):
        if last_name != "":
            self.enter_text(SignUpDetailElements.ADULT_LAST_NAME_FIELD, last_name, "Adult Last Name")
        else:
            self.enter_text(SignUpDetailElements.ADULT_LAST_NAME_FIELD, last_name)
            self.wait(5)
            element = self.get_element_text(SignUpDetailElements.ADULT_LAST_NAME_FIELD_ERROR_MESSAGE, "")
        #   print(element + "<br>")

    @allure.step("Enter Email {1} ")
    def enter_adult_email(self, email):

        if re.search(regex, email):
            self.enter_text(SignUpDetailElements.ADULT_EMAIL_FIELD, email, "Adult Email")
        else:
            self.enter_text(SignUpDetailElements.ADULT_EMAIL_FIELD, email)
            self.wait(5)
            element = self.get_element_text(SignUpDetailElements.ADULT_EMAIL_FIELD_ERROR_MESSAGE, "")
        #    print(element + "<br>")

    @allure.step("Enter UserName {1}")
    def enter_adult_username(self, username):
        if username != "":
            self.enter_text(SignUpDetailElements.ADULT_USERNAME_FIELD, username, "Adult Username")
        else:
            self.enter_text(SignUpDetailElements.ADULT_USERNAME_FIELD, username)
            self.wait(5)
            element = self.get_element_text(SignUpDetailElements.ADULT_USERNAME_FIELD_ERROR_MESSAGE, "")
        #    print(element + "<br>")

    @allure.step("Enter Password {1}")
    def enter_adult_password(self, password):
        if password != "":
            self.enter_text(SignUpDetailElements.ADULT_PASSWORD_FIELD, password, "Adult Password")
        else:
            self.enter_text(SignUpDetailElements.ADULT_PASSWORD_FIELD, password)
            self.wait(5)
            element = self.get_element_text(SignUpDetailElements.ADULT_PASSWORD_FIELD_ERROR_MESSAGE, "")
        #   print(element + "<br>")

    @allure.step("Click Not US checbox")
    def click_adult_not_us_checkbox(self):
        self.click(SignUpDetailElements.ADULT_NOT_US_CHECKBOX, "Not US checbox")

    @allure.step("Click Country Dropdown")
    def click_adult_country_field(self):
        self.click(SignUpDetailElements.ADULT_COUNTRY_FIELD, "Country Dropdown")

    @allure.step("Select country_name {1}")
    def select_adult_country(self, country_name):
        if country_name == "" or country_name == "Select":
            #   print(country_name)
            self.click_adult_country_field()
            self.wait(5)
            self.click(SignUpDetailElements.ADULT_SUBMIT_BUTTON, "Adult Submit Button")
            self.wait(5)
            element = self.get_element_text(SignUpDetailElements.ADULT_COUNTRY_FIELD_ERROR_MESSAGE, "")
        #    print(element + "<br>")
        else:
            country_option = (
                By.XPATH,
                "//select[@id='edit-field-user-location-und-0-country']//option[text()='" + str(country_name) + "']")
            self.click(country_option, "Country: " + str(country_name))

    @allure.step("Click Email Updates option")
    def click_adult_no_email_updates(self):
        self.click(SignUpDetailElements.ADULT_NO_EMAIL_UPDATES, "Email Updates option")

    @allure.step("Click Agree Terms checkbox")
    def click_adult_agree_checkbox(self):
        self.click(SignUpDetailElements.ADULT_AGREE_CHECKBOX, "Agree Terms checkbox")

    @allure.step("Click Adult Submit Button")
    def click_adult_submit_button(self):
        self.click(SignUpDetailElements.ADULT_SUBMIT_BUTTON, "Adult Submit Button")

    @allure.step("Enter User Name {1}")
    # Kid Signup Page Actions
    def enter_kid_username(self, username):
        if (username != ""):
            self.enter_text(SignUpDetailElements.KID_USERNAME_FIELD, username, "Kid Username")
        elif (username == ""):
            self.enter_text(SignUpDetailElements.KID_USERNAME_FIELD, username)
            self.wait(5)
            element = self.get_element_text(SignUpDetailElements.KID_USERNAME_FIELD_ERROR_MESSAGE, "")
        #   print(element + "<br>")

    @allure.step("Enter Password {1}")
    def enter_kid_password(self, password):
        if (password != ""):
            self.enter_text(SignUpDetailElements.KID_PASSWORD_FIELD, password, "Kid Password")
        elif (password == ""):
            self.enter_text(SignUpDetailElements.KID_PASSWORD_FIELD, password)
            self.wait(5)
            element = self.get_element_text(SignUpDetailElements.KID_PASSWORD_FIELD_ERROR_MESSAGE, "")
        #  print(element + "<br>")

    @allure.step("Click Age Month Dropdown")
    def click_kid_select_age_month_field(self):
        self.click(SignUpDetailElements.AGE_MONTH_FIELD, "Age Month Dropdown")

    @allure.step("Select month_number {1}")
    def select_kid_age_month(self, month_number):

        if str(month_number) == "":
            element = self.get_element_text(SignUpDetailElements.KID_AGE_MONTH_FIELD_ERROR_FIELD, "")
        #   print(element + "<br>")
        else:
            month_option = (By.XPATH, "//select[@id='edit-field-birthday-und-0-value-month']//option[@value='" + str(
                month_number) + "']")
            self.click(month_option, "Month Number: " + str(month_number))

    @allure.step("Click Age Year Dropdown")
    def click_kid_select_age_year_field(self):
        self.click(SignUpDetailElements.AGE_YEAR_FIELD, "Age Year Dropdown")

    @allure.step("Select year {1}")
    def select_kid_age_year(self, year):
        if str(year) == "":
            element = self.get_element_text(SignUpDetailElements.KID_AGE_MONTH_FIELD_ERROR_FIELD, "")
        #  print(element + "<br>")
        else:
            year_option = (
                By.XPATH,
                "//select[@id='edit-field-birthday-und-0-value-year']//option[@value='" + str(year) + "']")
        self.click(year_option, "Month Year: " + str(year))

    @allure.step("Click Next Button")
    def click_kid_next_button(self):
        self.click(SignUpDetailElements.KID_NEXT_BUTTON, "Next Button")

    @allure.step("Enter Kid Parent Email {1}")
    def enter_kid_parent_email(self, parent_email):

        if re.search(regex, parent_email):
            self.enter_text(SignUpDetailElements.KID_PARENT_EMAIL_FIELD, parent_email, "Kid Parent Email")
        else:
            self.enter_text(SignUpDetailElements.KID_PARENT_EMAIL_FIELD, parent_email, "Kid Parent Invalid Email")
            self.click(SignUpDetailElements.KID_SUBMIT_BUTTON, "")

            element = self.get_element_text(SignUpDetailElements.KID_PARENT_EMAIL_FIELD_ERROR_FIELD, "")
        #   print(element + "<br>")

    @allure.step("Click Agree Terms checkbox")
    def click_kid_agree_checkbox(self):
        self.click(SignUpDetailElements.KID_AGREE_CHECKBOX, "Agree Terms checkbox")

    @allure.step("Click Kid Submit Button")
    def click_kid_submit_button(self):
        self.click(SignUpDetailElements.KID_SUBMIT_BUTTON, "Kid Submit Button")

import allure

from lib.page_objects.BasePage import BasePage
from lib.web_elements import login_element


class LoginObject(BasePage):
    @allure.step("Enter Login Username {1}")
    def enter_name(self, username):
        if username != "":
            self.enter_text(login_element.LoginElements.EDITNAMEFIELD, username, "Login Username")
        else:
            self.enter_text(login_element.LoginElements.EDITNAMEFIELD, username)
            self.wait(5)
            # element = self.get_element_text(login_element.USERNAME_FIELD_ERROR_MESSAGE, "")
            # print(element + "<br>")

    @allure.step("Enter Login Password {1}")
    def enter_password(self, password):
        if password != "":
            self.enter_text(login_element.LoginElements.EDITPASSFIELD, password, "Login Password")
        else:
            self.enter_text(login_element.LoginElements.EDITPASSFIELD, password)
            self.wait(5)
            # element = self.get_element_text(login_element.USERNAME_FIELD_ERROR_MESSAGE, "")
            # print(element + "<br>")

    @allure.step("Click User Account")
    def click_select_user_account(self):
        self.click(login_element.LoginElements.USERACCOUNTBUTTON, "User Account ")

    @allure.step("Click Sign out Button")
    def click_select_signout_button(self):
        self.click(login_element.LoginElements.SIGNOUTBUTTON, "Sign out Button")

    @allure.step("Click login Button")
    def click_login_button(self):
        self.click(login_element.LoginElements.LOGINBUTTON, "login Button")

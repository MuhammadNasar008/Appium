from lib.page_objects.BasePage import BasePage
from lib.page_objects.LoginObject import LoginObject


class LoginPage(BasePage):

    def Login(self, username, password):
        self.login_page = LoginObject(self.driver)
        self.login_page.enter_name(username)
        self.wait(5)
        self.login_page.enter_password(password)
        self.wait(5)
        self.login_page.click_login_button()

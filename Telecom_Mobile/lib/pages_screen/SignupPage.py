from lib.page_objects.BasePage import BasePage
from lib.page_objects.HomeObject import HomeObject
from lib.page_objects.SignInObject import SignInObject
from lib.page_objects.SignupObject import SignupObject
from lib.utils.constants import Constants


class SignupPage(BasePage):

    def test_signup_page(self, base_selenium, configuration):
        print("Opening URL: " + configuration.HOME_URL)
        base_selenium.get(configuration.HOME_URL)

        self.home_page = HomeObject(base_selenium)
        self.signin_page = SignInObject(base_selenium)
        self.signup_page = SignupObject(base_selenium)

        self.home_page.wait(5)
        # Close Cookies Popup if present
        try:
            self.home_page.click_cookies_close_popup_button()
        except:
            pass

        self.home_page.click_sigin_button()
        self.home_page.wait(5)

        self.signin_page.click_create_account_button()
        self.signin_page.wait(5)

        assert self.signup_page.get_current_url() == configuration.SIGNUP_URL, "SignUp Page URL is not correct"
        assert self.signup_page.is_page_intro_present() == True, "SignUp Page Intro is not present"
        assert self.signup_page.get_page_intro_text() == Constants.SIGNUP_PAGE_INTRO_TEXT, "SignUp Page Intro text is not correct"
        assert Constants.SIGNUP_PAGE_ADULT_LABEL_TEXT in self.signup_page.get_adult_option_label_text(), "Adult Option Label Text is not correct"
        assert Constants.SIGNUP_PAGE_TEEN_LABEL_TEXT in self.signup_page.get_teen_option_label_text(), "Teen Option Label Text is not correct"
        assert Constants.SIGNUP_PAGE_KID_LABEL_TEXT in self.signup_page.get_kid_option_label_text(), "Kid Option Label Text is not correct"

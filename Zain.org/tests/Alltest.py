import os
from lib.pages_screen import CreateFreeKidSignupPage, CreateFreeAdultSignupPage, \
    CreateTeenAccountForUs_and_InternationalPage, MovieAndTvPage, PlusEntertainmentAgeLimitPage
from lib.pages_screen import GetItNow
from lib.pages_screen import PlusAddingDeletingKid
from lib.pages_screen.CreateNewPlusMemberPage import CreateNewPlusMemberPage
from lib.pages_screen.FilterWorkingForMovieBookAndGamePage import FilterWorkingForMovieBookAndGamePage
from lib.pages_screen.PlusAddingKidOutsideManageFamilyArea import PlusAddingKidOutsideManageFamilyArea
from tests import Init


class CsmTest(Init):

    def test_free_kid_signup(self):
        adult_signup = CreateFreeKidSignupPage.CreateFreeKidSignupPage(self.driver)
        adult_signup.test_free_kid_signup()

    def test_free_adult_signup(self):
        adult_signup = CreateFreeAdultSignupPage.CreateFreeAdultSignupPage(self.driver)
        adult_signup.test_free_adult_signup()

    def test_free_teen_signup_for_us_and_international(self):
        teen_signup = CreateTeenAccountForUs_and_InternationalPage.CreateTeenAccountForUs_and_InternationalPage(
            self.driver)
        teen_signup.test_free_teen_signup_for_international()
        teen_signup.test_free_teen_signup_for_us()

    def test_movie_remaining_view(self):
        os.system('cls')
        movies_tv_list = MovieAndTvPage.MovieAndTvPage(self.driver)
        movies_tv_list.verifying_movies_and_tv_review()
        movies_tv_list.verifying_movies_and_tv_second_review()
        movies_tv_list.verifying_movies_and_tv_third_review()

    def test_adding_deleting_kids(self):
        os.system('cls')
        login_screen = PlusAddingDeletingKid.PlusAddingDeletingKid(self.driver)
        login_screen.verifyingPlusAddingDeletingKid()

    def test_adding_kid_outside_manage_family_area(self):
        os.system('cls')
        plus_adding_kid = PlusAddingKidOutsideManageFamilyArea(self.driver)
        plus_adding_kid.verifyingAddingKidOutsideManageFamilyArea()

    def test_get_it_now(self):
        os.system('cls')
        stream = GetItNow.GetItNow(self.driver)
        stream.verifying_get_it_now()

    def test_plus_entertainment_age_limit(self):
        os.system('cls')
        entertainment_age_limit = PlusEntertainmentAgeLimitPage.PlusEntertainmentAgeLimitPage(self.driver)
        entertainment_age_limit.verifying_plus_entertainment_age_limit()

    def test_create_new_plus_membership(self):
        plus_adding_kid = CreateNewPlusMemberPage(self.driver)
        plus_adding_kid.verify_create_new_plus_member_account()

    def test_filter_working_for_movie_book_and_game(self):
        plus_adding_kid = FilterWorkingForMovieBookAndGamePage(self.driver)
        plus_adding_kid.verify_filter_working_for_movie_book_and_game()




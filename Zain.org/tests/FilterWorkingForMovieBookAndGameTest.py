import unittest
from selenium import webdriver

from lib.pages_screen.FilterWorkingForMovieBookAndGamePage import FilterWorkingForMovieBookAndGamePage
from lib.utils.urls import Url


class FilterWorkingForMovieBookAndGameTest(unittest.TestCase):
    @classmethod
    def setUp(self):
        self.driver = webdriver.Chrome(Url.CHROME_PATH)
        self.driver.implicitly_wait(30)
        self.driver.maximize_window()
        self.driver.get(Url.HOME_URL)

    def test_filter_working_for_movie_book_and_game(self):
        plus_adding_kid = FilterWorkingForMovieBookAndGamePage(self.driver)
        plus_adding_kid.verify_filter_working_for_movie_book_and_game()
    # @classmethod
    # def tearDown(self):
    #     self.driver.close()
    #     self.driver.quit()


if __name__ == "__main__":
    unittest.main()

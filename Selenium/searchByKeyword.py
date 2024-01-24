from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time

# Replace 'your_website_url' with the actual URL of the website you want to search on
website_url = 'https://www.youtube.com'

# Set the path to the webdriver executable (e.g., chromedriver, geckodriver)
# Download the appropriate webdriver for your browser from https://www.selenium.dev/documentation/en/webdriver/driver_requirements/

# Initialize the webdriver with options
chrome_options = webdriver.ChromeOptions()

# Initialize the webdriver with options
driver = webdriver.Chrome(options=chrome_options)

# Open the website
driver.get(website_url)

# Find the search box element (use 'name' attribute instead of 'id')
search_box = driver.find_element('name', 'search_query')

# Enter the search keyword and submit the form
search_box.send_keys('C programming')
search_box.send_keys(Keys.RETURN)

# Wait for some time to ensure the results are loaded (you may need to adjust the sleep duration)
time.sleep(5)

# Print the search results
search_results = driver.find_elements_by_css_selector('#video-title')
for result in search_results:
    print(result.text)

# Close the webdriver
driver.quit()

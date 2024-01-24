from selenium import webdriver
from selenium.webdriver.common.by import By

options = webdriver.ChromeOptions()
options.add_experimental_option("detach", True)
# Create a new instance of the Firefox WebDriver (you can also use Chrome, Edge, etc.)

driver = webdriver.Chrome(options=options)
# Replace 'your_url_here' with the actual URL of the webpage you want to test
url = 'https://www.rokomari.com'



# Navigate to the specified URL
driver.get(url)
print(driver.title)
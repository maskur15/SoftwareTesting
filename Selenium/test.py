from selenium import webdriver
print(webdriver.__version__)
options = webdriver.ChromeOptions()
options.add_experimental_option("detach", True)
driver = webdriver.Chrome(options=options)
driver.get("https://www.rokomari.com/cart/new")
element = driver.find_element_by_id
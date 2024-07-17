from bs4 import BeautifulSoup
import requests
import pandas as pd
from lxml import html
#
url = "https://www.tasteatlas.com/best/dishes?ref=main-menu"
page = requests.get(url)
tree = html.fromstring(page.content)
soup = BeautifulSoup(page.content, "html.parser")
#
xpath = '//*[@id="BestTraditionalDishes"]/div[2]/div[1]/div/a/div'
tr = tree.xpath(xpath)
#
print(tr)
print('\n')
#
for i in tr:
    print(i.text)
#

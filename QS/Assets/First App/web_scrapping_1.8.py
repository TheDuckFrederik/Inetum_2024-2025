from bs4 import BeautifulSoup
import requests
import pandas as pd
from lxml import html
#
url = "https://www.tasteatlas.com"
page = requests.get(url)
tree = html.fromstring(page.content)
soup = BeautifulSoup(page.content, "html.parser")
#
xpath = '//*[@id="feed"]/div/section[10]/section/div[2]/div/div/div/a/h4'
tr = tree.xpath(xpath)
#
print(tr)
print('\n')
#
for i in tr:
    print(i.text)
#

#
from bs4 import BeautifulSoup
import requests
import pandas as pd
#
text = []
cnt = 0
url = "https://www.tasteatlas.com/best/dishes?ref=main-menu"
page = requests.get(url)
soup = BeautifulSoup(page.content,"html.parser")
#
rn = soup.find_all("ul", id_="food-ingredients__list--recipe-razor")
#
print(rn)
print('\n')
for i in rn:
    print(i.text)

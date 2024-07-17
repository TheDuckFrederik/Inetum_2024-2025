#
from bs4 import BeautifulSoup
import requests
import pandas as pd
#
url = "https://www.tasteatlas.com/guotie/recipe"
page = requests.get(url)
soup = BeautifulSoup(page.content, "html.parser")
#
rn = soup.select("#food-ingredients__list--recipe-razor")
#
print(rn)
print('\n')
for i in rn:
    print(i.text)


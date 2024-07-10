#
from bs4 import BeautifulSoup
import requests
import pandas as pd
#
url = "https://www.tasteatlas.com/spain"
page = requests.get(url)
soup = BeautifulSoup(page.content, "html.parser")
#
titulo_receta = soup.select("#search-results-whattoeat-content > div:nth-child(1) > div > div > div:nth-child(1) > div > div > div > h2")
#
print(titulo_receta)
print('\n')
for i in titulo_receta:
    print(i.text)\
#

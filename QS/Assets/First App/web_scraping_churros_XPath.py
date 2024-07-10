#
from bs4 import BeautifulSoup
import requests
import pandas as pd
from lxml import html
#
o = []
url = "https://www.tasteatlas.com/churros/recipe"
page = requests.get(url)
tree = html.fromstring(page.content)
#
xpath = '//*[@id="bodyDiv"]/div/div/section[2]/div/h1/span[1]'
name = tree.xpath(xpath)
xpath = '//*[@id="bodyDiv"]/div/div/section[2]/div/h1/span[2]'
country = tree.xpath(xpath)
xpath = '//*[@id="bodyDiv"]/div/div/section/div/div/h3'
h3 = tree.xpath(xpath)
xpath = '//*[@id="bodyDiv"]/div/div/section[3]/div/div/div/div/p'
history = tree.xpath(xpath)
#
for i in name:
    print("Nombre: {}" .format(i.text))
for i in country:
    print("Pais: {}" .format(i.text))
for i in history:
    o.append(i.text)
for i in h3:
    print(i.text)
    if i.text == "Introduction & history":
        print(o)
#

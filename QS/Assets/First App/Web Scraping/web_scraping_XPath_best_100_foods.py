#
from bs4 import BeautifulSoup
import requests
import pandas as pd
from lxml import html
#
dish_list = []
count = 1
url = "https://www.tasteatlas.com/best/dishes?ref=main-menu"
page = requests.get(url)
tree = html.fromstring(page.content)
soup = BeautifulSoup(page.content, "html.parser")
#
xpath = '//*[@id="BestTraditionalDishes"]/div[2]/div/div/a/div'
plato = tree.xpath(xpath)
#
for i in plato:
    dish_name = i.text.strip()
    if dish_name != "" and dish_name != "\n":  # Check if the element is not empty or "\n"
        # dish_list.append(dish_name)
        print("{}.- {}\nPais: {}" .format(count, dish_name))
        count += 1
#

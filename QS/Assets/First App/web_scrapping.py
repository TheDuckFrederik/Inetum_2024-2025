#
from bs4 import BeautifulSoup
import requests
import panda as pd
#
url = "https://www.tasteatlas.com/pa-amb-tomaquet"
page = request.get(url)
soup = BeautifulSoup(page.content,"html.parser")
#

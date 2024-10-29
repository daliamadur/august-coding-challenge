import requests
from bs4 import BeautifulSoup

#make request to website
url = "http://books.toscrape.com/"
response = requests.get(url)

#check request is successful
if response.status_code == 200:
    print("Suceessfully accessed website!")
else:
    print("Failed to connect to website", response.status_code)

#parse html content of page
soup = BeautifulSoup(response.text, 'html.parser')

#find book items
books = soup.find_all('article', class_='product_pod')

#extarct title and price of each book

for book in books:
    title = book.h3.a['title']
    price = book.find('p', class_='price_color').text

    print(f'Title: {title}, Price {price}')

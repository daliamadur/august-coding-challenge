import requests

APIkey = "{actual key}"

city = input("Please enter a city: ")

data = requests.get(f"https://api.openweathermap.org/data/2.5/weather?q={city}&units=metric&appid={APIkey}")

if (data.status_code != 200) :
    print("There was an error with your request :(")
else:
    weather = data.json()['weather'][0]['main']
    desc = data.json()['weather'][0]['description']
    temperature = data.json()['main']['temp']

    print()
    print("--- ", city, "weather info :3 ---")
    print("Weather: ", weather, ", ", desc)
    print("Temperature: ", temperature, "°C")
    print()

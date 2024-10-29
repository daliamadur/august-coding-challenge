import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error

#generate data
np.random.seed(0)
X = 2 * np.random.rand(100, 1)
y = 4 + 3 * X + np.random.randn(100, 1)

#visualise data
plt.scatter(X, y)
plt.title("Generated Data :3")
plt.xlabel("X")
plt.ylabel("y")
plt.show()

#split data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

#create model
lin_reg = LinearRegression()

#train model
lin_reg.fit(X_train, y_train)

#print coefficients
print(f"Intercept: {lin_reg.intercept_}")
print(f"Coefficient: {lin_reg.coef_}")

#make predictions
y_pred = lin_reg.predict(X_test)

#calculate mean squared error
mse = mean_squared_error(y_test, y_pred)
print(f"Mean Swared Error: {mse}")

#visualise regression line
plt.scatter(X_test, y_test, color='blue')
plt.plot(X_test, y_pred, color='red', linewidth=2)
plt.title("Linear Regression Fit")
plt.xlabel("X")
plt.ylabel("y")
plt.show()

# LoRa Logistics Service

> The demo video is here [LoRa Logistic Service](https://www.youtube.com/watch?v=48IRj23cwBg)

> This project is my third year project(graduational project/ team project) in National Taipei University 
> We use the novel communication method- LoRa to create a logistic service with APP
> My job is the app UIdesign, programming in the offline component, and the gateway(Rasperberry pi) to listen the data tranfer by LoRa



- Some description:

  When you click the app icon, the landing page is going to show in the first time opening the app. You can see the landing page on the example picture. 

  Next you are going to enter into the login page to key in your account information. If you don't have account, you also can create a new account. After you login successfully, you can see the main activity of the app.

![Landing Page Picture](https://github.com/HermesKeng/DeliveryAPP/blob/master/image/background.png)
![Main Activity Interface](https://github.com/HermesKeng/DeliveryAPP/blob/master/image/mainActivity.png)

From the left of main activity, there is a icon you can call the navigation bar by clicking.

![Navigation Bar](https://github.com/HermesKeng/DeliveryAPP/blob/master/image/navBar.png)

This is first glimpse of the app. In more details, we use Azure Platform to store our data in the mySQL database. Also, we build a server on the Azure to listen all the event occuring.

- Database information
  1. Account information
  2. Booking information
  3. Location information
  4. Car information

Each time if you want to reserve a car to deliver your package to other place, you only need to click "新增訂單" to create the order. You only need to follow three simple steps, and you can create it successfully. Besides, the delivery cost is going to show the money you spend on the bottom of page. 

- Three Steps For Creating The New Order 
  1. Choose time and location 
  2. Select the receiver
  3. Check the order information

![Order Step1](https://github.com/HermesKeng/DeliveryAPP/blob/master/image/reserveStep1.png)
![Order Step2](https://github.com/HermesKeng/DeliveryAPP/blob/master/image/reserveStep2.png)
![Order Step3](https://github.com/HermesKeng/DeliveryAPP/blob/master/image/reserveStep3.png)
  
After you create the new order, you can show the new order on the main activity. There are three different status which represent by three different color, red, orange, and gree on each card view.

- Three Different Status On The Order
  1. Red (Unsolved Order)
  2. Orange (Order in process)
  3. Green (Deliver successfully)

![Unsolved Order](https://github.com/HermesKeng/DeliveryAPP/blob/master/image/UnprocessStatus.png)
![Order in process](https://github.com/HermesKeng/DeliveryAPP/blob/master/image/InprocessStatus.png)
![Deliver successfully](https://github.com/HermesKeng/DeliveryAPP/blob/master/image/SuccessStatus.png)

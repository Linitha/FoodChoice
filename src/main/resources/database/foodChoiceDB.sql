CREATE SCHEMA foodchoicedb;

USE foodchoicedb;

CREATE TABLE `customer` (
  `CustomerID` bigint(50) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(30) DEFAULT NULL,
  `LastName` varchar(30) DEFAULT NULL,
  `Password` varchar(30) DEFAULT NULL,
  `EmailID` varchar(30) NOT NULL,
  PRIMARY KEY (`CustomerID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;


INSERT INTO foodchoicedb.customer(CustomerID,FirstName,LastName,Password,EmailID) VALUES (1,'Linitha','Tadsina','123','linithareddy@gmail.com');
INSERT INTO foodchoicedb.customer(CustomerID,FirstName,LastName,Password,EmailID) VALUES (2,'L','T','1234','li@abc.com');


USE foodchoicedb;

CREATE TABLE `restaurant` (
  `RestaurantID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ZipCode` bigint(5) NOT NULL,
  `RestaurantName` varchar(100) NOT NULL,
  `loginUserid` varchar(30) NOT NULL,
  `loginPassword` varchar(30) NOT NULL,
  PRIMARY KEY (`RestaurantID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;


INSERT INTO foodchoicedb.restaurant(RestaurantID,ZipCode,RestaurantName,loginUserid,loginPassword) VALUES (1,94538,'Taste Of India','tasteofindia@gmail.com','abcd');
INSERT INTO foodchoicedb.restaurant(RestaurantID,ZipCode,RestaurantName,loginUserid,loginPassword) VALUES (2,94538,'Linitha Kitchen','linithakitchen@gmail.com','abcd');
INSERT INTO foodchoicedb.restaurant(RestaurantID,ZipCode,RestaurantName,loginUserid,loginPassword) VALUES (3,94538,'Tadu Ethiopian Kitchen','taduetho@gmail.com','abcd');
INSERT INTO foodchoicedb.restaurant(RestaurantID,ZipCode,RestaurantName,loginUserid,loginPassword) VALUES (4,94538,'Little Heaven Deli','','');
INSERT INTO foodchoicedb.restaurant(RestaurantID,ZipCode,RestaurantName,loginUserid,loginPassword) VALUES (5,94538,'The Flying Falafel','','');
INSERT INTO foodchoicedb.restaurant(RestaurantID,ZipCode,RestaurantName,loginUserid,loginPassword) VALUES (6,95134,'Panera','','');

USE foodchoicedb;

CREATE TABLE `menu` (
  `ItemId` bigint(20) NOT NULL AUTO_INCREMENT,
  `RestaurantID` bigint(20) NOT NULL,
  `ItemName` varchar(100) NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`ItemId`),
  KEY `Foriegn key` (`RestaurantID`),
  CONSTRAINT `Foriegn key` FOREIGN KEY (`RestaurantID`) REFERENCES `restaurant` (`RestaurantID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;


INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (1,1,'Chicken Biryani',11.9);
INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (2,1,'Mutter Paneer',9.99);
INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (3,1,'House Special Soup',11.9);
INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (4,1,'Sweet Corn Soup',5.9);
INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (5,1,'Samosa',5.9);
INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (6,1,'Onion Pakoda',3.9);
INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (7,1,'Vegetable Manchurian',9.9);
INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (8,2,'CHEESE PIZZA WITH ONE TOPPING',10.9);
INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (9,2,'CHEESE PIZZA WITH TWO TOPPINGS',8.5);
INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (10,2,'CHEESE PIZZA WITH THREE TOPPINGS',12.3);
INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (11,2,'JALAPENO POPPER',6);
INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (12,2,'MOZZARELLA STICKS',7.5);
INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (13,2,'FRENCH FRIES',3);
INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (14,2,'ONION RINGS',5);
INSERT INTO foodchoicedb.menu(ItemId,RestaurantID,ItemName,price) VALUES (15,2,'GARDEN SALAD',4.95);

USE foodchoicedb;

CREATE TABLE `orders` (
  `OrderID` bigint(6) NOT NULL AUTO_INCREMENT,
  `OrderTotal` double NOT NULL DEFAULT '0',
  `NumberOfItems` int(3) NOT NULL DEFAULT '0',
  `RestaurantID` bigint(20) NOT NULL,
  `CustomerEmailID` varchar(30) NOT NULL,
  `OrderStatus` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`OrderID`),
  KEY `Foreign KEy` (`RestaurantID`),
  CONSTRAINT `Foreign KEy` FOREIGN KEY (`RestaurantID`) REFERENCES `restaurant` (`RestaurantID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;


INSERT INTO foodchoicedb.orders(OrderID,OrderTotal,NumberOfItems,RestaurantID,CustomerEmailID,OrderStatus) VALUES (1,10,2,1,'linithareddy@gmail.com','ordered');
INSERT INTO foodchoicedb.orders(OrderID,OrderTotal,NumberOfItems,RestaurantID,CustomerEmailID,OrderStatus) VALUES (2,0,0,1,'linithareddy@gmail.com','Ordered');
INSERT INTO foodchoicedb.orders(OrderID,OrderTotal,NumberOfItems,RestaurantID,CustomerEmailID,OrderStatus) VALUES (3,0,0,1,'linithareddy@gmail.com','Ordered');
INSERT INTO foodchoicedb.orders(OrderID,OrderTotal,NumberOfItems,RestaurantID,CustomerEmailID,OrderStatus) VALUES (4,0,0,1,'linithareddy@gmail.com','Ordered');
INSERT INTO foodchoicedb.orders(OrderID,OrderTotal,NumberOfItems,RestaurantID,CustomerEmailID,OrderStatus) VALUES (5,0,0,1,'linithareddy@gmail.com','Ordered');
INSERT INTO foodchoicedb.orders(OrderID,OrderTotal,NumberOfItems,RestaurantID,CustomerEmailID,OrderStatus) VALUES (6,0,0,1,'linithareddy@gmail.com','Ordered');
INSERT INTO foodchoicedb.orders(OrderID,OrderTotal,NumberOfItems,RestaurantID,CustomerEmailID,OrderStatus) VALUES (7,0,0,1,'linithareddy@gmail.com','Ordered');
INSERT INTO foodchoicedb.orders(OrderID,OrderTotal,NumberOfItems,RestaurantID,CustomerEmailID,OrderStatus) VALUES (8,21.89,2,1,'linithareddy@gmail.com','Ordered');
INSERT INTO foodchoicedb.orders(OrderID,OrderTotal,NumberOfItems,RestaurantID,CustomerEmailID,OrderStatus) VALUES (9,21.89,2,1,'linithareddy@gmail.com','Ordered');
INSERT INTO foodchoicedb.orders(OrderID,OrderTotal,NumberOfItems,RestaurantID,CustomerEmailID,OrderStatus) VALUES (12,21.89,2,1,'linithareddy@gmail.com','Ordered');

USE foodchoicedb;

CREATE TABLE `foodorders` (
  `OrderID` bigint(6) NOT NULL,
  `Item` varchar(100) NOT NULL,
  `Price` double NOT NULL,
  `Quantity` int(5) NOT NULL DEFAULT '1',
  `ID` bigint(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;


INSERT INTO foodchoicedb.foodorders(OrderID,Item,Price,Quantity,ID) VALUES (12,'Mutter Paneer',9.99,0,1);
INSERT INTO foodchoicedb.foodorders(OrderID,Item,Price,Quantity,ID) VALUES (12,'Chicken Biryani',11.9,0,2);











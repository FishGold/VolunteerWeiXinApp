CREATE TABLE items (
  itemId BIGINT auto_increment PRIMARY KEY,
	title VARCHAR(100) NOT NULL,
  contactName VARCHAR(10) NOT NULL,
  tel VARCHAR(15) NOT NULL,
  serviceStartTime DATE NOT NULL,
  serviceStopTime DATE NOT NULL,
  needNumber int NOT NULL,
  applyCondition VARCHAR(50) NOT NULL,
  currentNumber int DEFAULT 0,
  serviceCategory VARCHAR(10) NOT NULL,
  city VARCHAR(10) NOT NULL,
  suberbs VARCHAR(10) NOT NULL,
  detailAdress VARCHAR(20) NOT NULL,
  longitude DOUBLE NOT NULL,
  latitude DOUBLE NOT NULL,
  serviceContent text NOT NULL,
  itemState VARCHAR(5) DEFAULT '未开始'
)CHARSET=utf8;
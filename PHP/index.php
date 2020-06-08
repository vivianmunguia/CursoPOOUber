<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");

$uberX = new UberX("CDE432", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("OIU987", new Account("Andrea Ferran", "AND852"), "Dodge", "Attitude");
$uberPool->printDataCar();
?>
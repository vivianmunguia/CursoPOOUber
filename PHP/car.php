<?php
require_once 'account.php';
class Car {
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar() {
        echo "<p> License: ". $this->license . "</p>";
        echo "<p> Driver name: ". $this->driver->name . "</p>";
        echo "<p> Driver document: ". $this->driver->document . "</p>";
    }
}
?>

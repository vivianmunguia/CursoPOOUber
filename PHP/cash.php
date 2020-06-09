<?php
require_once('payment.php')
class Cash extends Payment {
    public $id;

    public function__construct($id)
        parent::__construct($id);
}
<?php
require_once('payment.php');
class Paypal extends Payment{
    public $id;
    public $email;

    public function__construct($id, $email){
        parent::__construct($id);
        $this->email->$email;
    }
}
?>
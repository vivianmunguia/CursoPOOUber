<?php
require_once('account.php')

class Driver extends Account {
    public $id;
    public $name;
    public $document;
    public $email;
    public $password;

    public function__construct($id, $name, $document, $email, $password){
        parent::__construct($id, $name, $document, $email, $password)
    }
}
?>
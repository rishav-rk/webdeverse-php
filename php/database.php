<?php
//change this accordingly
$db_host="localhost";
$db_user="root";
$db_password="";
$db_name="tut_website";
$conn = new mysqli($db_host,$db_user,$db_password,$db_name);
if ($conn->connect_error) {
    die("<h1><center>An unexpected error occrured</center></h1>". $conn->connect_error);
}
?>
<?php
$hostname = "localhost";
$username = "root";
$password = "";
$database = "tut_website";

// Create a connection
$conn = new mysqli($hostname, $username, $password, $database);

// Check the connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$pro_id = 1;
$f=fopen("../txt/i-o.txt","r");
// Sample data for insertion
while(!feof($f)){
    $pro_name = htmlspecialchars(fgets($f));
    $file_path="../input_output/$pro_id.java";
    $program=file_get_contents($file_path);
    $stmt = $conn->prepare("UPDATE input_output SET program=? WHERE pro_id=?");
    $stmt->bind_param("si", $program, $pro_id);

if ($stmt->execute() === TRUE) {
    echo "$pro_id Data updated successfully<br>";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}
$pro_id++;
}
// Close the connection
$conn->close();

?>

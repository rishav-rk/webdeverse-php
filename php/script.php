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
$f = fopen("../txt/multithreading.txt", "r");

// Sample data for insertion
while (!feof($f)) {
    // Read content from a source code file
    $file_path = "../multithreading/$pro_id.java";
    $program = file_get_contents($file_path);
    // $pro_name = fgets($f);x
    $pro_name = fgets($f);
    $image_path = "../multithreading/$pro_id.png";
    // Escape values before inserting into the database
    // $pro_name = $conn->real_escape_string($pro_name);

    // Use prepared statements to prevent SQL injection
    $sql = "INSERT INTO multithreading (pro_id, pro_name, program, image_path) VALUES (?, ?, ?, ?)";
    $stmt = $conn->prepare($sql);
    $stmt->bind_param("isss", $pro_id, $pro_name, $program, $image_path);

    // Set the image path

    // Execute the prepared statement
    if ($stmt->execute()) {
        echo "$pro_id Data inserted successfully<br>";
    } else {
        echo "Error: " . $sql . "<br>" . $stmt->error;
    }

    $pro_id++;
}

// Close the prepared statement
$stmt->close();

// Close the connection
fclose($f);
$conn->close();

?>

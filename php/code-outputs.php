<?php
require("../php/database.php");

// Assuming "pro_id" and "pro_name" are the column names in your database table
$topics = array("Single Dimensional Arrays"=>'single_d_array',
"Two Dimensional Arrays"=>'two_d_array',
"Basic Program Constructs"=>'basics',
"Graphical User Interface (AWT)"=>'awt',
"Graphical User Interface (Swing)"=>'swing',
"Interfaces"=>'interfaces',
"Inheritance"=>'inheritance',
"Multithreading"=>'multithreading',
"Input / Output"=>'input_output',
"Java Database Connectivity"=>'jdbc',
"Functions"=>'functions',
"Exception Handling"=>'exception',
"Applets"=>'applet',
"Data Conversion"=>'dc',
"Strings"=>'strings',
"Delegation Event Model"=>'dem',
"Object Oriented Programming"=>'oops',
"Packages"=>'packages'
);
$pro_id=$_REQUEST['pro'];
$title=$_REQUEST['topic'];
$query = $conn->query("SELECT * FROM $topics[$title] WHERE pro_id=$pro_id");
$result = $query->fetch_assoc(); // Fetch the result as an associative array

// Check if the query was successful
if ($result) {
    $pro_name = str_replace(array("\\r", "\\n"), '', $result['pro_name']);
    $pro_id= $result['pro_id'];
    $program = $result['program'];
    $image_path = $result['image_path'];
} else {
    $pro_name = "No data found"; // Provide a default value or handle the error accordingly
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/nav-bar.css">
    <link rel="stylesheet" href="../css/code-output.css">
    <script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
    <title>Webdeverse | Code-Output for Programs</title>
</head>
<body>
    <header>
        <div class="navbar"></div>
        <div class="head_content">
            <div class="page_title">
                <h4>Program <?php echo $pro_id?> :- <span class="diff"><?php echo"&nbsp;&nbsp;&nbsp;&nbsp;". $pro_name; ?></span></h4>
            </div>
    </header>
    <main>
    <div class="code-container">
            <!-- Placeholder code -->
            <pre><code><?php echo htmlspecialchars($program); ?></code></pre>
        </div>
        <div class="output-container">
            <img src="<?php echo $image_path; ?>" alt="Output Image">
            <?php ?>
        </div>
    </main>
</body>
<script>
   $(function(){  
        $(".navbar").load("../html/navbar.html");
    });
</script>
</html>

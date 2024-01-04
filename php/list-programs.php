<?php 
			$file_name = $_REQUEST['file_txt'];
			$file_java = fopen("../txt/$file_name.txt","r");
			$count = 1;
			$title = $_REQUEST['title'];
?>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="../css/nav-bar.css">
	<link rel="stylesheet" href="../css/php-lists.css">
	<link rel="stylesheet" href="../css/java-programs-head.css">
    <script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
	<title>Webdeverse | Programs - Java | Single Dimensional Arrays
	</title>
</head>
<body>
	<header>
		<!-- <div class="navbar"></div> -->
                <div class="page_title">
                    <h1><?php echo $title; ?></h1>
            </div>
	</header>
	<main>
		<div class="list_items_holder">

			<?php
while(!feof($file_java))
{
	echo "<a class='directers' href='../php/code-outputs.php?pro=$count&topic=$title' target='_blank'><div class='card_java'><span class='list_items'>".$count.". ".fgets($file_java)."<span></div></a>";
	$count++;
}
fclose($file_java);
?>
</div>
</main>
</body>
<script>
   $(function(){  
        $(".navbar").load("../html/navbar.html");
    });
</script>
</html>
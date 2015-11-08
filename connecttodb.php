
<?php
echo "hi";
$mysqlservername = "ec2-54-74-114-193.eu-west-1.compute.amazonaws.com";
$mysqlusername = "root";
$mysqlpassword = "code4good";
$mysqldbname = "cfg_database";

// Create connection

$conn = new mysqli($mysqlservername, $mysqlusername, $mysqlpassword, $mysqldbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

?>



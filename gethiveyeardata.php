<?php
include 'connecttodb.php';
// Create connection

$sql = "SELECT date FROM hives WHERE id = '$id' ";


$result = $conn->query($sql);

if ($result->num_rows > 0) {

    // output data of each row
    while($row = $result->fetch_assoc()) {
         $rows[] = $row;
    }
    print json_encode($rows);
   
} else {
    echo "0 results";
}
$conn->close();

?>
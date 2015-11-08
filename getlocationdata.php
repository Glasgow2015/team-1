<?php
include 'connecttodb.php';
// Create connection

$sql = "SELECT lat, log FROM hives WHERE id = '1'";

$result = $conn->query($sql);

if ($result->num_rows > 0) {

    // output data of each row
    while($row = $result->fetch_assoc()) {
         /*$rows[] = $row;*/
         echo '{lat:',$row['lat'],',log:',$row['log'],'}';
    }
    /*print json_encode($rows);*/

} else {
    echo "0 results";
}
$conn->close();

?>
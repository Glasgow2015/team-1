<?php
$_POST = $_GET;
if(empty($_POST)){
	//echo '{"success":0,"message":"The Request is empty"}';
//	die();
}

array_walk_recursive($_POST,function($item,$key){
	$_POST[$key] = htmlspecialchars(isset($item) ? $item : '');
});
echo "here ", $_POST['table'];
if(!empty($_POST['table'])){
	require "connecttodb.php";
	
	if($_POST['table'] === "hives"){
		echo "hi";
		$sql = "INSERT INTO `hives`(`apname`, `number`, `lat`, `log`,`date`,`sun`) VALUES ('${_POST['apname']}',${_POST['number']},${_POST['lat']},${_POST['log']},".(isset($_POST['date']) ? $_POST['date'] : 'NOW()').",'${_POST['sun']}');";
	
		if(!$conn->query($sql)){
			//if($conn->errno != 0){
				//echo "Unknown error code #", $db->errno;
				echo $sql, "<br>";
				echo '{"success":0,"message":"'.$conn->errno.'"}';
			//}
		} else {
			echo '{"success":1,"message":""}';
		}
		$conn->close();
	}else{
		echo $_POST['table'];
	}
}else{
	echo "no table";
	print_r($_POST);
}

?>
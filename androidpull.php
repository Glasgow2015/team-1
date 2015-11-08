<?php



$opts = array(
  'http'=>array(
    'method'=>"GET",
    'header'=>"Accept : application/json \r\n" .
              "Content-type : application/json"
  )
);

$context = stream_context_create($opts);

// Open the file using the HTTP headers set above
$file = file_get_contents('http://54.74.114.193:8000/ap/hives/', false, $context);

$var = json_decode($file);

var_dump($file);

?>
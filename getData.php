<!DOCTYPE html>
<html>
<head>
<script>
var token = "020d9948-8cf8-4c46-91bd-72bb11b92549";
var db = require('orchestrate')(token);

db.get('cfg_hives', '*')
.then(function (res) {
  console.log(res.body); // prints response body
  console.log(res.body.name); // prints 'Bruce Wayne'
})
.fail(function (err) {
  console.log(err); // prints error
});
</script>
</head>


<body>
</body>
</html>
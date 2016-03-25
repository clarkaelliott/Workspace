<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=Cp1252">
	<title>Hello World!</title>
	</head>
		<body>
			<?php			
				echo '<p>Hello World';
				echo "<br>";				
				echo "This is PHP";
				echo "<br><br>I had some difficulty getting escape key to work...
				<br>Notice that Strings can run multiple lines in PHP Syntax</p>";
				
				$myname = 'Clark Elliott';
				$myothername = "Clark Elliott";
				
				echo $myname;
				echo '<br>';
				echo $myothername;
				echo "<br>";
				echo "I am completely lost regarding the difference between the single/double quotes in PHP";
				
				echo "<br><br>Some Variables<br>";
				// My First Variables
				$myNumber = 42;
				$anotherNumber = 13.37;
				$aResult = $myNumber / $anotherNumber;
				
				echo $myNumber . " / " . $anotherNumber . " = " . $aResult . "<br>";
				echo $myNumber . " / " . pi() . " = " . $myNumber / pi() . "<br>";
				echo "<br>";
				echo $myNumber / $anotherNumber;
				echo "<br>" . " I've learned how to Concatenate Strings/Variables/Expressions<br>"
						. "Call Methods, Declare/Initialize Variables of Different Types<br>"
						. "and... that PHP is hellaccurate with math<br>";
				
				// TODO
				
			
			?>
		</body>
	</head>
</html>
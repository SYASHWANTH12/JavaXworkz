<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.form{
 background-image: url('data:image/jpeg;base64,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'); /* Replace 'your_cricket_image.jpg' with the actual image file path */
        background-size:auto;
    background-color: blue;
	text-align: center;
	margin: 0 auto;
	width: 400px;
	padding: 20px;
	border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}
.form label{
display:list-item;
text-align: left;
color:white;
margin-top: 10px;

}
.form input{
 color:black;   
}
.submit{
    margin-top: 10px;
    background-color: green;
    
}


</style>
</head>
<body>
	<form action="Attach" method="post" id="matchForm" class="form">
		<div>
			<label>Tournament Name</label> <input type="text"
				placeholder="Enter The Tournament Name" name="name" id="name"
				maxlength="20">

		</div>
		<div>
			<label>Housting Country</label> <input type="text"
				placeholder="Enter the country" name="country" id="country">

		</div>
		<div>
			<label>Match Date</label> <input type="date"
				placeholder="Enter the date" name="match" id="match">
		</div>
		<div>
			<label>Team 1</label> <input type="text"
				placeholder="Enter team member" name="team1" id="team1">
		</div>
		<div>
			<label>Team 2</label> <input type="text"
				placeholder="Enter team member" name="team2" id="team2">
		</div>
		<div>
			<label>Team 1 Captian</label> <input type="text"
				placeholder="Captian Name" name="captian1" id="captian1">
		</div>
		<div>
			<label>Team 2 Captian</label> <input type="text"
				placeholder="Captian Name" name="captian2" id="captian2">
		</div>
		<div>
			<label>Umpire Name</label> <input type="text"
				placeholder="Captian Name" name="umpire" id="umpire">
		</div>
		<div>
			<label>Stadium Name</label> <input type="text"
				placeholder="Captian Name" name="stadium" id="stadium">
		</div>
		<div>
			<label>Third Umpire Name</label> <input type="text"
				placeholder="Captian Name" name="third" id="third">
		</div>
		<div>
			<label>Stadium Capacity</label> <input type="text"
				placeholder="Captian Name" name="capacity" id="capacity">
		</div>
		<input type="submit" placeholder="submit" value="Submit" id="submit" class="submit" disabled
			>

	</form>
	<script>
    const matchForm = document.getElementById("matchForm");
    const submit = document.getElementById("submit");
    matchForm.addEventListener("input", function() {
        const name = document.getElementById("name").value;
        const country = document.getElementById("country").value;
        const team1 = document.getElementById("team1").value;
        const team2 = document.getElementById("team2").value;
        const captian1 = document.getElementById("captian1").value; // Corrected variable name
        const captian2 = document.getElementById("captian2").value; // Corrected variable name
        const umpire = document.getElementById("umpire").value;
        const stadium = document.getElementById("stadium").value;
        const third = document.getElementById("third").value;
        const capacity = parseInt(document.getElementById("capacity").value);

        const isname = name.length > 3 && name.length < 20;
        const iscountry = country.length > 3 && country.length < 20;
        const isteam1 = team1.length > 3 && team1.length < 20;
        const isteam2 = team2.length > 3 && team2.length < 20;
        const iscaptain1 = captian1.length > 3 && captian1.length < 20;
        const iscaptain2 = captian2.length > 3 && captian2.length < 20;
        const isumpire = umpire.length > 3 && umpire.length < 20;
        const isstadium = stadium.length > 3 && stadium.length < 20;
        const isthird = third.length > 3 && third.length < 20;
        const iscapacity = !isNaN(capacity) && capacity > 0 && capacity < 1000000;

        if (isname && iscountry && isteam1 && isteam2
            && iscaptain1 && iscaptain2 && isumpire
            && isstadium && isthird && iscapacity) {
            submit.removeAttribute("disabled");
        } else {
            submit.setAttribute("disabled", "disabled");
        }
    });
</script>

</body>
</html>
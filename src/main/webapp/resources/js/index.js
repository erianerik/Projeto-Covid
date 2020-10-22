$(".input-submit").click(function() {
	event.preventDefault();

	let dadosCovid = {};
	let state = $("#estado").val();
	let city = $("#input-city").val();

	if (validationFields(state, city)) {
		city = verificationCitySeparatedSpace(city);
		removeErrors();
		requestAjaxApi(state,city);

	} else {
		showErrors();
	}
})

function validationFields(state, city) {
	return state != null && city != "";
}

function showErrors() {
	$("#estado").addClass("error");
	$("#input-city").addClass("error");
	$(".validation").show();
}

function removeErrors() {
	$("#estado").removeClass("error");
	$("#input-city").removeClass("error");
	$(".validation").hide();
}

function requestAjaxApi(state, city) {
	let dadosCovid = {};
	
	$.ajax({
		type: 'GET',
		url: "/buscarDados",
		data: {
			estado: state,
			cidade: city
		},
		success: function (data){
			dadosCovid = (data.results[0]);
			showData(dadosCovid);
				
		}
	});
	
	
}

function showData(dadosCovid) {
	let dataUpdate = dadosCovid.date;
	dataUpdate = dataUpdate.split("-");
	console.log(dataUpdate);
	
	let date = new Date(dataUpdate[0], dataUpdate[1] - 1, dataUpdate[2]);

	
	$("#number-cases").html(dadosCovid.last_available_confirmed);
	$("#confirmed-deaths").html(dadosCovid.last_available_deaths);
	$("#update-date").html(date.toLocaleDateString());
}

function verificationCitySeparatedSpace(city){
		if(city.split(" ").length > 1) {
			city = city.split(" ");
			city = city.join("%20", " ");
			return city;
		}
	return city;
}
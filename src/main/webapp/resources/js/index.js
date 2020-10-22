$(".input-submit").click(function() {
	event.preventDefault();

	var state = $("#estado").val();
	var city = $("#input-city").val();

	if (validationFields(state, city)) {
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
	debugger;
	$.ajax({
		type: 'GET',
		url: "/buscarDados",
		data: {
			estado: state,
			cidade: city
		},
		success: function (dadosCovid){
			console.log(dadosCovid)
		},
		error: function(e) {
    		console.log(e);
 		}
	});
}
$("#btn-search").click(function(){
	var keyword =  $("#example-search-input").val();
	refreshList(keyword);
});

// pake enter
$('#example-search-input').keypress(function(e){
	console.log("enter");
	if(e.which == 13){
		$("#btn-search	").click();
	}
});
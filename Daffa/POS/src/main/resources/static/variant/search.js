//PAKE CLICK
$("#button-search").click(function() {
	var keyword = $("#example-search-input").val();

	refreshList(keyword);
});

//PAKE ENTER
$("#example-search-input").keypress(function(e){
	console.log("enter")
	if(e.which == 13){
		$("#button-search").click()
	}
})
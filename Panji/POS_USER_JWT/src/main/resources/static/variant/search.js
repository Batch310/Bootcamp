$("#btn-search").click(function(){
	var keyword = $("#example-search-input").val();
	refreshList(keyword);
})
//Pake enter
$('#example-search-input').keypress(function(e){
	if(e.which == 13){
		$("#btn-search").click();
	}
});
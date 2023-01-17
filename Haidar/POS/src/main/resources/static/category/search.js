$("#example-search-input").keypress(function(event) {
    if (event.keyCode == 13) {
        $("#search-button").click();
    }
});

$("#search-button").click(function() {
	var keyword = $("#example-search-input").val();
	refreshList(keyword);
});

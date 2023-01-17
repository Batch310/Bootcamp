$("#btn-search").click(function () {
    var keyword = $("#example-search-input").val();
    console.log(keyword);

    refreshList(keyword);
})

//pake enter
$("#example-search-input").keypress(function (e) {
    console.log('asd')
    if (e.which == 13) {
        $("#btn-search").click();
    }
});
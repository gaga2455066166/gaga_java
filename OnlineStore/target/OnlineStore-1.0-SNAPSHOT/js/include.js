$(function () {
    $.get("header.html",function (data) {
        $("#header").html(data);
    });
    $.get("footer.html",function (data) {
        $("#footer").html(data);
    });
    $.get("adminHeader.html",function (data) {
        $("#adminHeader").html(data);
    });

});
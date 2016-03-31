/**
 * Created by User on 3/27/2016.
 */
$(document).ready(setInterval(function(){
    $.ajax({
        type: "POST",
        url: "/"
    }).success(function(response) {
    })

}, 10000));

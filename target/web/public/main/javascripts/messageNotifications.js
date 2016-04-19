/**
 * Created by User on 4/14/2016.
 */
$(document).ready(setInterval(function(){
    $.ajax({
        type: "get",
        url: "/messagenotif"
    }).success(function(response) {
        //if("0"!=response){
            $('#message_notifications').html(response);
        //}
    })
}, 5000));

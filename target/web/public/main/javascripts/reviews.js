/**
 * Created by User on 4/22/2016.
 */
var radios = document.getElementsByName('ratings');
var value;
function gg() {
    if($("input[name=ratings]:checked")){
        value = $("input[name=ratings]:checked").val();
        $('#ocjena').val(value)
    }
};
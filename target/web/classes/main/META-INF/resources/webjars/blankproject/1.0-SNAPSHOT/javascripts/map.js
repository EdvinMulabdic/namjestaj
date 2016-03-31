var loc = $('#locations').val().replace(/[\[\]']+/g, '');
var loca = loc.split(",");

var locations = [];
for(i = 0; i < loca.length; i++){
      locations[i] = loca[i].split("-") ;
}

var geocoder;
var map;


function initialize() {
    map = new google.maps.Map(
        document.getElementById("map"), {
            center: new google.maps.LatLng(43.850572, 18.393421),
            zoom: 7,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        });
    geocoder = new google.maps.Geocoder();

    for (i = 0; i < locations.length; i++) {
        geocodeAddress(locations, i);

    }

}
//google.maps.event.addDomListener(window, "load", initialize);

function geocodeAddress(locations, i) {
    var title = locations[i][0];
    var address = locations[i][1];
    //var bounds = new google.maps.LatLngBounds();

    geocoder.geocode({
            'address': locations[i][1]
        },
        function(results, status) {
            if (status == google.maps.GeocoderStatus.OK) {
                var marker = new google.maps.Marker({
                    icon: 'http://maps.google.com/mapfiles/ms/icons/red-dot.png',
                    map: map,
                    zoom: 10,
                    position: results[0].geometry.location,
                    title: title,
                    animation: google.maps.Animation.DROP,
                    address: address
                })
                infoWindow(marker, map, title, address);
                //bounds.extend(marker.getPosition());
                //map.fitBounds(bounds);

            }
        });

}

function infoWindow(marker, map, title, address) {
    google.maps.event.addListener(marker, 'click', function() {
        var html = "<div><h3>" + title + "</h3><p>" + address + "<br></div></p></div>";
        iw = new google.maps.InfoWindow({
            content: html,
            maxWidth: 350
        });
        iw.open(map, marker);
    });
}


//
//function createMarker(results) {
//    var bounds = new google.maps.LatLngBounds();
//    var marker = new google.maps.Marker({
//        icon: 'http://maps.google.com/mapfiles/ms/icons/blue.png',
//        map: map,
//        position: results[0].geometry.location,
//        title: title,
//        animation: google.maps.Animation.DROP,
//        address: address
//    })
//    bounds.extend(marker.getPosition());
//    map.fitBounds(bounds);
//    infoWindow(marker, map, title, address);
//    return marker;
//}



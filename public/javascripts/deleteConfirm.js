/**
 * Created by User on 2/3/2016.
 */

$('body').on('click', 'a[data-role="delete-item"]', function (e) {
    e.preventDefault();
    $toDelete = $(this);
    swal({
        title: 'BRISANJE!!!',
        text: 'Da li sigurno želite obrisati ?',
        type: 'warning',
        showCancelButton: true,
        showConfirmButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'DA, obriši!',
        cancelButtonText: 'NE, odustani!',
        confirmButtonClass: 'confirm-class',
        cancelButtonClass: 'cancel-class',
        showLoaderOnConfirm: true,
        closeOnConfirm: false,
        closeOnCancel: true
    }, function (isConfirm) {
        swal.disableButtons();
        if (isConfirm) {
            $.ajax({
                url: $toDelete.attr("href"),
                method: "delete"
            }).success(function (response) {
                $toDelete.parents($toDelete.attr("data-delete-parent")).remove();
                location.reload();
                swal({
                    title: 'Obrisan!',
                    text: 'Korisnik uspjesno obrisan.',
                    type: 'success',
                    timer: 1000
                });
            });
        }
    });
});

$('body').on('click', 'a[data-role="delete-user"]', function (e) {
    e.preventDefault();
    $toDelete = $(this);
    swal({
        title: 'BRISANJE!!!',
        text: 'Ukoliko  izbrišete korisnika, automatski će se izbrisati svi njegovi objekti i proizvodi!!!',
        type: 'warning',
        showCancelButton: true,
        showConfirmButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'DA, obriši!',
        cancelButtonText: 'NE, odustani!',
        confirmButtonClass: 'confirm-class',
        cancelButtonClass: 'cancel-class',
        showLoaderOnConfirm: true,
        closeOnConfirm: false,
        closeOnCancel: true
    }, function (isConfirm) {
        swal.disableButtons();
        if (isConfirm) {
            $.ajax({
                url: $toDelete.attr("href"),
                method: "delete"
            }).success(function (response) {
                $toDelete.parents($toDelete.attr("data-delete-parent")).remove();
                location.reload();
            });
        }
    });
});

$('body').on('click', 'a[data-role="delete-store"]', function (e) {
    e.preventDefault();
    $toDelete = $(this);
    swal({
        title: 'BRISANJE!!!',
        text: 'Ukoliko  izbrišete objekat, on se više neće prikazivati na google mapi!!!',
        type: 'warning',
        showCancelButton: true,
        showConfirmButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'DA, obriši!',
        cancelButtonText: 'NE, odustani!',
        confirmButtonClass: 'confirm-class',
        cancelButtonClass: 'cancel-class',
        showLoaderOnConfirm: true,
        closeOnConfirm: false,
        closeOnCancel: true
    }, function (isConfirm) {
        swal.disableButtons();
        if (isConfirm) {
            $.ajax({
                url: $toDelete.attr("href"),
                method: "delete"
            }).success(function (response) {
                $toDelete.parents($toDelete.attr("data-delete-parent")).remove();
                location.reload();
            });
        }
    });
});
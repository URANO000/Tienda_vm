function cargarImagen(input) {
    if (input.files && input.files[0]){
        let lector = new FileReader();
        lector.onload = function(e) {
            $('#blah').attr('src',e.target.result)
                    .height(200);
        };
        
        lector.readAsDataURL(input.files[0]);
    }
}
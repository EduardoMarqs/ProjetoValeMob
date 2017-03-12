var retorno


function validarObrigatorio(churros) {
	if (churros.value == "") {
		churros.style.border = "1px solid red";
		aviso.innerHTML = "Preencha o(s) campo(s) vazio(s)";
		retorno = false;
	} else {
		churros.style.border = "1px solid silver";
		aviso.innerHTML = " ";
		retorno = true;
	}
}